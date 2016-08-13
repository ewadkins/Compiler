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
public class IncrementPostfix extends Operation {

    protected final Expression expression;

    public IncrementPostfix(Expression expression, Block parent, Token token) {
        super(parent, token);
        this.expression = expression;
    }

    @Override
    public List<Variable> getVariables() {
        return new ArrayList<Variable>(expression.getVariables());
    }

    @Override
    public java.lang.String toString() {
        return expression + "++";
    }

}
