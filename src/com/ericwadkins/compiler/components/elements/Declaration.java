package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Type;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Declaration extends Element {

    protected final Variable variable;

    public Declaration(Type type, Variable variable, Block parent, Token token) {
        super(parent, token);
        variable.setType(type);
        this.variable = variable;
    }

    @Override
    public List<Variable> getVariables() {
        return Arrays.asList(variable);
    }

    @Override
    public java.lang.String toString() {
        return variable.getType() + " " + variable + ";";
    }

}
