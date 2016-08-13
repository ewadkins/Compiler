package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public abstract class Element {

    protected final Block parent;
    protected final Token token;

    public Element(Block parent, Token token) {
        this.parent = parent;
        this.token = token;
    }

    public List<Element> getPriorElements() {
        if (parent == null) {
            return new ArrayList<>();
        }
        return parent.getPriorElements(this);
    }

    public abstract List<Variable> getVariables();

}
