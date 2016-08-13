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
public class Modulus extends Operation {

    protected final Expression expression1;
    protected final Expression expression2;

    public Modulus(Expression expression1, Expression expression2, Block parent, Token token) {
        super(parent, token);
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>(expression1.getVariables());
        variables.addAll(expression2.getVariables());
        return variables;
    }

    @Override
    public String toString() {
        return "(" + expression1 + " % " + expression2 + ")";
    }

}
