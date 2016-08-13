package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Block extends Element implements Comparable {

    private static long BLOCK_COUNT = 0;

    protected final long blockId;
    protected final List<Element> elements = new ArrayList();

    public Block() { // Master block
        super(null, null);
        blockId = BLOCK_COUNT;
        BLOCK_COUNT++;
    }

    public Block(Block parent, Token token) {
        super(parent, token);
        blockId = BLOCK_COUNT;
        BLOCK_COUNT++;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void addAll(List<Element> elementList) {
        elements.addAll(elementList);
    }

    public List<Element> getElementsInScope() {
        List<Element> scope = new ArrayList<>();
        if (parent != null) {
            scope.addAll(parent.getElementsInScope());
        }
        scope.addAll(elements);
        return scope;
    }

    public List<Element> getPriorElements(Element element) {
        List<Element> seen = new ArrayList<>();
        boolean contains = false;
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) == element
                    || elements.get(i) instanceof BlockElement && ((BlockElement) elements.get(i)).block == element) {
                contains = true;
                break;
            }
        }
        if (contains) {
            if (parent != null) {
                seen.addAll(parent.getPriorElements(this));
            }
            for (int i = 0; i < elements.size(); i++) {
                seen.add(elements.get(i));
                if (elements.get(i) == element
                        || elements.get(i) instanceof BlockElement && ((BlockElement) elements.get(i)).block == element) {
                    break;
                }
            }
            return seen;
        }
        else {
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i) instanceof Block) {
                    seen = ((Block) elements.get(i)).getPriorElements(element);
                    if (seen.size() > 0) return seen;
                }
                else if (elements.get(i) instanceof BlockElement
                        && ((BlockElement) elements.get(i)).block instanceof Block) {
                    seen = ((Block) ((BlockElement) elements.get(i)).block).getPriorElements(element);
                    if (seen.size() > 0) return seen;
                }
            }
            return new ArrayList<>();
        }
    }

    public long getID() {
        return blockId;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        for (int i = 0; i < elements.size(); i++) {
            variables.addAll(elements.get(i).getVariables());
        }
        return variables;
    }

    @Override
    public java.lang.String toString() {
        return "{BLOCK " + blockId + (blockId == 0 ? " master" : "") + "}";
    }

    @Override
    public int compareTo(Object o) {
        return (int) (getID() - ((Block) o).getID());
    }
}
