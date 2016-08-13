package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Variable;
import com.ericwadkins.compiler.components.expressions.Expression;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class IfStatement extends BlockElement {

    protected final Expression expression;

    public IfStatement(Expression expression, Block block, Block parent, Token token) {
        super(block, parent, token);
        this.expression = expression;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>(expression.getVariables());
        variables.addAll(block.getVariables());
        return variables;
    }

    @Override
    public java.lang.String toString() {
        return "if (" + expression + ") " + block;
    }
}
