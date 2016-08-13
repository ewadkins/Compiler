package com.ericwadkins.compiler.components.operations;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Difference extends Operation {

    protected final List<Expression> expressions;

    public Difference(List<Expression> expressions, Block parent, Token token) {
        super(parent, token);
        this.expressions = expressions;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        for (int i = 0; i < expressions.size(); i++) {
            variables.addAll(expressions.get(i).getVariables());
        }
        return variables;
    }

    @Override
    public java.lang.String toString() {
        java.lang.String string = "(";
        for (int i = 0; i < expressions.size(); i++) {
            string += expressions.get(i).toString() + (i < expressions.size() - 1 ? " - " : "");
        }
        string += ")";
        return string;
    }

}
