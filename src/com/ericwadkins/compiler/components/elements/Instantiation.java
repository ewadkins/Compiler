package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Type;
import com.ericwadkins.compiler.components.expressions.Variable;
import com.ericwadkins.compiler.components.expressions.Expression;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Instantiation extends Element {

    protected final Variable variable;
    protected final Expression expression;

    public Instantiation(Type type, Variable variable, Expression expression, Block parent, Token token) {
        super(parent, token);
        variable.setType(type);
        this.variable = variable;
        this.expression = expression;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<>(expression.getVariables());
        variables.add(variable);
        return variables;
    }

    @Override
    public java.lang.String toString() {
        return variable.getType() + " " + variable + " = " + expression + ";";
    }
}
