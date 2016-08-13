package com.ericwadkins.compiler.components.assignments;

import com.ericwadkins.compiler.components.elements.Block;
import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Variable;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class BitwiseOrAssignment extends Assignment {

    public BitwiseOrAssignment(Variable variable, Expression expression, Block parent, Token token) {
        super(variable, expression, parent, token);
    }

    @Override
    public java.lang.String toString() {
        return variable + " |= " + expression + ";";
    }

}
