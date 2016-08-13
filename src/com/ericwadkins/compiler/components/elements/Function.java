package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.components.expressions.Expression;
import com.ericwadkins.compiler.components.expressions.Type;
import com.ericwadkins.compiler.components.expressions.Variable;
import com.ericwadkins.compiler.components.operations.Operation;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericwadkins on 8/11/16.
 */
public class Function extends BlockElement {

    protected final Type type;
    protected final Variable variable;
    protected final List<Type> types;
    protected final List<Variable> variables;

    public Function(Type type, Variable variable, List<Type> types, List<Variable> variables,
                    Block block, Block parent, Token token) {
        super(block, parent, token);
        this.type = type;
        this.variable = variable;
        this.types = types;
        this.variables = variables;
    }

    @Override
    public List<Variable> getVariables() {
        List<Variable> variables = new ArrayList<Variable>();
        variables.add(variable);
        variables.addAll(this.variables);
        variables.addAll(block.getVariables());
        return variables;
    }

    @Override
    public String toString() {
        String string = type + " " + variable + "(";
        for (int i = 0; i < types.size(); i++) {
            string += types.get(i).toString() + " " + variables.get(i) + (i < types.size() - 1 ? ", " : "");
        }
        string += ") " + block;
        return string;
    }

}
