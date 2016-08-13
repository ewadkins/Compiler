
package com.ericwadkins.compiler;

import com.ericwadkins.compiler.components.elements.*;
import com.ericwadkins.compiler.components.expressions.*;
import com.ericwadkins.compiler.components.expressions.Character;
import com.ericwadkins.compiler.components.expressions.Number;
import com.ericwadkins.compiler.components.expressions.String;
import com.ericwadkins.compiler.components.operations.*;
import com.ericwadkins.compiler.components.assignments.*;
import com.ericwadkins.parser.CompilerListener;
import com.ericwadkins.parser.CompilerParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link CompilerListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */

public class CompilerMainListener implements CompilerListener {

    protected final Stack<Object> stack = new Stack<>();
    protected final Stack<Block> blocks = new Stack<>();
    protected final List<Block> blockList = new ArrayList<>();

    private final boolean debug;

    public CompilerMainListener(boolean debug) {
        this.debug = debug;
        blocks.add(new Block());
    }

    public List<Block> getBlocks() {
        return new ArrayList<>(blockList);
    }

	@Override public void enterRoot(CompilerParser.RootContext ctx) { }

	@Override public void exitRoot(CompilerParser.RootContext ctx) {
        if (debug) System.out.println("Exiting root");

        Block masterBlock = blocks.get(0);
        List<Element> elements = new ArrayList<>();
        while (!stack.empty()) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);
        masterBlock.addAll(elements);

        blockList.add(masterBlock);
        Collections.sort(blockList);

        // END OF PARSER TREE
    }

	@Override public void enterElement(CompilerParser.ElementContext ctx) { }

	@Override public void exitElement(CompilerParser.ElementContext ctx) { }

    @Override public void enterBasic_element(CompilerParser.Basic_elementContext ctx) { }

    @Override public void exitBasic_element(CompilerParser.Basic_elementContext ctx) { }

    @Override public void enterBlock_element(CompilerParser.Block_elementContext ctx) { }

    @Override public void exitBlock_element(CompilerParser.Block_elementContext ctx) { }

    @Override public void enterBlock(CompilerParser.BlockContext ctx) {
        if (debug) System.out.println("Entering Block");

        blocks.push(new Block(blocks.peek(), ctx.getStart()));
    }

	@Override public void exitBlock(CompilerParser.BlockContext ctx) {
        if (debug) System.out.println("Exiting Block");

        Block block = blocks.pop();
        List<Element> elements = new ArrayList<>();
        for (int i = 0; i < ctx.element().size(); i++) {
            elements.add((Element) stack.pop());
        }
        Collections.reverse(elements);
        block.addAll(elements);

        stack.add(block);
        blockList.add(block);

        if (debug) System.out.println(block);
    }

    @Override public void enterNative_block(CompilerParser.Native_blockContext ctx) { }

    @Override public void exitNative_block(CompilerParser.Native_blockContext ctx) { }

    @Override public void enterDeclaration(CompilerParser.DeclarationContext ctx) { }

	@Override public void exitDeclaration(CompilerParser.DeclarationContext ctx) {
        if (debug) System.out.println("Exiting Declaration");

        Variable variable = (Variable) stack.pop();
        Type type = (Type) stack.pop();

        Declaration declaration = new Declaration(type, variable, blocks.peek(), ctx.getStart());
        stack.push(declaration);

        if (debug) System.out.println("\t" + declaration);
    }

	@Override public void enterInstantiation(CompilerParser.InstantiationContext ctx) { }

	@Override public void exitInstantiation(CompilerParser.InstantiationContext ctx) {
        if (debug) System.out.println("Exiting Instantiation");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();
        Type type = (Type) stack.pop();

        Instantiation instantiation = new Instantiation(type, variable, expression, blocks.peek(), ctx.getStart());
        stack.push(instantiation);

        if (debug) System.out.println("\t" + instantiation);
    }

	@Override public void enterAssignment(CompilerParser.AssignmentContext ctx) { }

	@Override public void exitAssignment(CompilerParser.AssignmentContext ctx) { }

    @Override public void enterDirect_assign(CompilerParser.Direct_assignContext ctx) { }

    @Override public void exitDirect_assign(CompilerParser.Direct_assignContext ctx) {
        if (debug) System.out.println("Exiting DirectAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        DirectAssignment directAssignment = new DirectAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(directAssignment);

        if (debug) System.out.println("\t" + directAssignment);
    }

    @Override public void enterSum_assign(CompilerParser.Sum_assignContext ctx) { }

    @Override public void exitSum_assign(CompilerParser.Sum_assignContext ctx) {
        if (debug) System.out.println("Exiting SumAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        SumAssignment sumAssignment = new SumAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(sumAssignment);

        if (debug) System.out.println("\t" + sumAssignment);
    }

    @Override public void enterDifference_assign(CompilerParser.Difference_assignContext ctx) { }

    @Override public void exitDifference_assign(CompilerParser.Difference_assignContext ctx) {
        if (debug) System.out.println("Exiting DifferenceAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        DifferenceAssignment differenceAssignment = new DifferenceAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(differenceAssignment);

        if (debug) System.out.println("\t" + differenceAssignment);
    }

    @Override public void enterProduct_assign(CompilerParser.Product_assignContext ctx) { }

    @Override public void exitProduct_assign(CompilerParser.Product_assignContext ctx) {
        if (debug) System.out.println("Exiting ProductAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        ProductAssignment productAssignment = new ProductAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(productAssignment);

        if (debug) System.out.println("\t" + productAssignment);
    }

    @Override public void enterQuotient_assign(CompilerParser.Quotient_assignContext ctx) { }

    @Override public void exitQuotient_assign(CompilerParser.Quotient_assignContext ctx) {
        if (debug) System.out.println("Exiting QuotientAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        QuotientAssignment quotientAssignment = new QuotientAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(quotientAssignment);

        if (debug) System.out.println("\t" + quotientAssignment);
    }

    @Override public void enterModulus_assign(CompilerParser.Modulus_assignContext ctx) { }

    @Override public void exitModulus_assign(CompilerParser.Modulus_assignContext ctx) {
        if (debug) System.out.println("Exiting ModulusAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        ModulusAssignment modulusAssignment = new ModulusAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(modulusAssignment);

        if (debug) System.out.println("\t" + modulusAssignment);
    }

    @Override public void enterPower_assign(CompilerParser.Power_assignContext ctx) { }

    @Override public void exitPower_assign(CompilerParser.Power_assignContext ctx) {
        if (debug) System.out.println("Exiting PowerAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        PowerAssignment powerAssignment = new PowerAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(powerAssignment);

        if (debug) System.out.println("\t" + powerAssignment);
    }

    @Override public void enterBit_left_assign(CompilerParser.Bit_left_assignContext ctx) { }

    @Override public void exitBit_left_assign(CompilerParser.Bit_left_assignContext ctx) {
        if (debug) System.out.println("Exiting BitwiseLeftAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseLeftAssignment bitLeftAssignment = new BitwiseLeftAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(bitLeftAssignment);

        if (debug) System.out.println("\t" + bitLeftAssignment);
    }

    @Override public void enterBit_right_assign(CompilerParser.Bit_right_assignContext ctx) { }

    @Override public void exitBit_right_assign(CompilerParser.Bit_right_assignContext ctx) {
        if (debug) System.out.println("Exiting BitwiseRightAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseRightAssignment bitRightAssignment = new BitwiseRightAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(bitRightAssignment);

        if (debug) System.out.println("\t" + bitRightAssignment);
    }

    @Override public void enterBit_and_assign(CompilerParser.Bit_and_assignContext ctx) { }

    @Override public void exitBit_and_assign(CompilerParser.Bit_and_assignContext ctx) {
        if (debug) System.out.println("Exiting BitwiseAndAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseAndAssignment bitAndAssignment = new BitwiseAndAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(bitAndAssignment);

        if (debug) System.out.println("\t" + bitAndAssignment);
    }

    @Override public void enterBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx) { }

    @Override public void exitBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx) {
        if (debug) System.out.println("Exiting BitwiseXorAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseXorAssignment bitXorAssignment = new BitwiseXorAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(bitXorAssignment);

        if (debug) System.out.println("\t" + bitXorAssignment);
    }

    @Override public void enterBit_or_assign(CompilerParser.Bit_or_assignContext ctx) { }

    @Override public void exitBit_or_assign(CompilerParser.Bit_or_assignContext ctx) {
        if (debug) System.out.println("Exiting BitwiseOrAssignment");

        Expression expression = (Expression) stack.pop();
        Variable variable = (Variable) stack.pop();

        BitwiseOrAssignment bitOrAssignment = new BitwiseOrAssignment(variable, expression, blocks.peek(), ctx.getStart());
        stack.push(bitOrAssignment);

        if (debug) System.out.println("\t" + bitOrAssignment);
    }

    @Override public void enterDiscarded_statement(CompilerParser.Discarded_statementContext ctx) { }

	@Override public void exitDiscarded_statement(CompilerParser.Discarded_statementContext ctx) {
        if (debug) System.out.println("Exiting DiscardedStatement");

        Expression expression = (Expression) stack.pop();

        DiscardedStatement statement = new DiscardedStatement(expression, blocks.peek(), ctx.getStart());
        stack.push(statement);

        if (debug) System.out.println("\t" + statement);
    }

	@Override public void enterIf_statement(CompilerParser.If_statementContext ctx) { }

	@Override public void exitIf_statement(CompilerParser.If_statementContext ctx) {
        if (debug) System.out.println("Exiting IfStatement");

        Element element = (Element) stack.pop();
        Expression expression = (Expression) stack.pop();

        Block block;
        if (!(element instanceof Block)) {
            block = new Block(blocks.peek(), ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        IfStatement ifStatement = new IfStatement(expression, block, blocks.peek(), ctx.getStart());
        stack.push(ifStatement);

        if (debug) System.out.println("\t" + ifStatement);
    }

	@Override public void enterElse_if_statement(CompilerParser.Else_if_statementContext ctx) { }

	@Override public void exitElse_if_statement(CompilerParser.Else_if_statementContext ctx) {
        if (debug) System.out.println("Exiting ElseIfStatement");

        Element element = (Element) stack.pop();
        Expression expression = (Expression) stack.pop();

        Block block;
        if (!(element instanceof Block)) {
            block = new Block(blocks.peek(), ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        ElseIfStatement elseIfStatement = new ElseIfStatement(expression, block, blocks.peek(), ctx.getStart());
        stack.push(elseIfStatement);

        if (debug) System.out.println("\t" + elseIfStatement);
    }

	@Override public void enterElse_statement(CompilerParser.Else_statementContext ctx) { }

	@Override public void exitElse_statement(CompilerParser.Else_statementContext ctx) {
        if (debug) System.out.println("Exiting ElseStatement");

        Element element = (Element) stack.pop();

        Block block;
        if (!(element instanceof Block)) {
            block = new Block(blocks.peek(), ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        ElseStatement elseStatement = new ElseStatement(block, blocks.peek(), ctx.getStart());
        stack.push(elseStatement);

        if (debug) System.out.println("\t" + elseStatement);
    }

    @Override public void enterFor_loop(CompilerParser.For_loopContext ctx) { }

    @Override
    public void exitFor_loop(CompilerParser.For_loopContext ctx) {

    }

    @Override public void enterWhile_loop(CompilerParser.While_loopContext ctx) { }

    @Override
    public void exitWhile_loop(CompilerParser.While_loopContext ctx) {

    }

    @Override public void enterFunction(CompilerParser.FunctionContext ctx) { }

	@Override public void exitFunction(CompilerParser.FunctionContext ctx) {
        if (debug) System.out.println("Exiting Function");

        int parameterCount = ctx.type().size() - 1;

        Element element = (Element) stack.pop();

        Block block;
        if (!(element instanceof Block)) {
            block = new Block(blocks.peek(), ctx.getStart());
            block.add(element);
            blockList.add(block);
        }
        else {
            block = (Block) element;
        }

        List<Type> types = new ArrayList<>();
        List<Variable> variables = new ArrayList<>();
        for (int i = 0; i < parameterCount; i++) {
            variables.add((Variable) stack.pop());
            types.add((Type) stack.pop());
        }
        Collections.reverse(types);
        Collections.reverse(variables);

        Variable variable = (Variable) stack.pop();
        Type type = (Type) stack.pop();

        Function function = new Function(type, variable, types, variables, block, blocks.peek(), ctx.getStart());
        stack.push(function);

        if (debug) System.out.println("\t" + function);
    }

    @Override public void enterReturn_statement(CompilerParser.Return_statementContext ctx) { }

    @Override public void exitReturn_statement(CompilerParser.Return_statementContext ctx) {
        if (debug) System.out.println("Exiting ReturnStatement");

        Expression expression = (Expression) stack.pop();

        ReturnStatement returnStatement = new ReturnStatement(expression, blocks.peek(), ctx.getStart());
        stack.push(returnStatement);

        if (debug) System.out.println("\t" + returnStatement);
    }

	@Override public void enterExpression(CompilerParser.ExpressionContext ctx) { }

	@Override public void exitExpression(CompilerParser.ExpressionContext ctx) {
        if (ctx.postfix_call_subscript() != null) {
            if (ctx.postfix_call_subscript().getText().equals("++")) {
                if (debug) System.out.println("Exiting PostfixIncrement");

                PostfixIncrement postfixIncrement =
                        new PostfixIncrement((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(postfixIncrement);

                if (debug) System.out.println("\t" + postfixIncrement);
            }
            else if (ctx.postfix_call_subscript().getText().equals("--")) {
                if (debug) System.out.println("Exiting PostfixDecrement");

                PostfixDecrement postfixDecrement =
                        new PostfixDecrement((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(postfixDecrement);

                if (debug) System.out.println("\t" + postfixDecrement);
            }
            else if (ctx.postfix_call_subscript().getText().startsWith("(")) {
                if (debug) System.out.println("Exiting Call");

                int expressionCount = ctx.expression().size();
                List<Expression> expressions = new ArrayList<>();
                for (int i = 0; i < expressionCount; i++) {
                    expressions.add((Expression) stack.pop());
                }
                Collections.reverse(expressions);
                Expression expression = (Expression) stack.pop();

                Call call = new Call(expression, expressions, blocks.peek(), ctx.getStart());
                stack.push(call);

                if (debug) System.out.println("\t" + call);
            }
            else if (ctx.postfix_call_subscript().getText().startsWith("[")) {
                if (debug) System.out.println("Exiting Subscript");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Subscript subscript = new Subscript(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(subscript);

                if (debug) System.out.println("\t" + subscript);
            }
        }
        else if (ctx.prefix_unary() != null) {
            if (ctx.prefix_unary().getText().equals("++")) {
                if (debug) System.out.println("Exiting PrefixIncrement");

                PrefixIncrement prefixIncrement =
                        new PrefixIncrement((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(prefixIncrement);

                if (debug) System.out.println("\t" + prefixIncrement);
            }
            else if (ctx.prefix_unary().getText().equals("--")) {
                if (debug) System.out.println("Exiting PrefixDecrement");

                PrefixDecrement prefixDecrement =
                        new PrefixDecrement((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(prefixDecrement);

                if (debug) System.out.println("\t" + prefixDecrement);
            }
            else if (ctx.prefix_unary().getText().equals("+")) {
                if (debug) System.out.println("Exiting Plus");

                Plus plus = new Plus((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(plus);

                if (debug) System.out.println("\t" + plus);
            }
            else if (ctx.prefix_unary().getText().equals("-")) {
                if (debug) System.out.println("Exiting Minus");

                Minus minus = new Minus((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(minus);

                if (debug) System.out.println("\t" + minus);
            }
            else if (ctx.prefix_unary().getText().equals("!")) {
                if (debug) System.out.println("Exiting Not");

                Not not = new Not((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(not);

                if (debug) System.out.println("\t" + not);
            }
            else if (ctx.prefix_unary().getText().equals("~")) {
                if (debug) System.out.println("Exiting BitwiseNot");

                BitwiseNot bitwiseNot = new BitwiseNot((Expression) stack.pop(), blocks.peek(), ctx.getStart());
                stack.push(bitwiseNot);

                if (debug) System.out.println("\t" + bitwiseNot);
            }
        }
        else if (ctx.pow_root() != null) {
            if (ctx.pow_root().getText().equals("**")) {
                if (debug) System.out.println("Exiting Power");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Power power = new Power(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(power);

                if (debug) System.out.println("\t" + power);
            }
            else if (ctx.pow_root().getText().equals("//")) {
                if (debug) System.out.println("Exiting Root");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Root root = new Root(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(root);

                if (debug) System.out.println("\t" + root);
            }
        }
        else if (ctx.mult_div_mod() != null) {
            if (ctx.mult_div_mod().getText().equals("*")) {
                if (debug) System.out.println("Exiting Product");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Product product = new Product(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(product);

                if (debug) System.out.println("\t" + product);
            }
            else if (ctx.mult_div_mod().getText().equals("/")) {
                if (debug) System.out.println("Exiting Quotient");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Quotient quotient = new Quotient(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(quotient);

                if (debug) System.out.println("\t" + quotient);
            }
            else if (ctx.mult_div_mod().getText().equals("%")) {
                if (debug) System.out.println("Exiting Remainder");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Remainder remainder = new Remainder(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(remainder);

                if (debug) System.out.println("\t" + remainder);
            }
        }
        else if (ctx.add_sub() != null) {
            if (ctx.add_sub().getText().equals("+")) {
                if (debug) System.out.println("Exiting Sum");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Sum sum = new Sum(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(sum);

                if (debug) System.out.println("\t" + sum);
            }
            else if (ctx.add_sub().getText().equals("-")) {
                if (debug) System.out.println("Exiting Difference");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Difference difference =
                        new Difference(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(difference);

                if (debug) System.out.println("\t" + difference);
            }
        }
        else if (ctx.bitleft_right() != null) {
            if (ctx.bitleft_right().getText().equals("<<")) {
                if (debug) System.out.println("Exiting BitwiseLeftShift");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseLeftShift bitwiseLeftShift =
                        new BitwiseLeftShift(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(bitwiseLeftShift);

                if (debug) System.out.println("\t" + bitwiseLeftShift);
            }
            else if (ctx.bitleft_right().getText().equals(">>")) {
                if (debug) System.out.println("Exiting BitwiseRightShift");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseRightShift bitwiseRightShift =
                        new BitwiseRightShift(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(bitwiseRightShift);

                if (debug) System.out.println("\t" + bitwiseRightShift);
            }
        }
        else if (ctx.less_greater() != null) {
            if (ctx.less_greater().getText().equals("<")) {
                if (debug) System.out.println("Exiting LessThan");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                LessThan lessThan = new LessThan(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(lessThan);

                if (debug) System.out.println("\t" + lessThan);
            }
            else if (ctx.less_greater().getText().equals("<=")) {
                if (debug) System.out.println("Exiting LessThanOrEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                LessThanOrEqual lessThanOrEqual =
                        new LessThanOrEqual(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(lessThanOrEqual);

                if (debug) System.out.println("\t" + lessThanOrEqual);
            }
            else if (ctx.less_greater().getText().equals(">")) {
                if (debug) System.out.println("Exiting GreaterThan");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                GreaterThan greaterThan =
                        new GreaterThan(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(greaterThan);

                if (debug) System.out.println("\t" + greaterThan);
            }
            else if (ctx.less_greater().getText().equals(">=")) {
                if (debug) System.out.println("Exiting GreaterThanOrEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                GreaterThanOrEqual greaterThanOrEqual =
                        new GreaterThanOrEqual(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(greaterThanOrEqual);

                if (debug) System.out.println("\t" + greaterThanOrEqual);
            }
        }
        else if (ctx.equal_notequal() != null) {
            if (ctx.equal_notequal().getText().equals("==")) {
                if (debug) System.out.println("Exiting Equal");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Equal equal = new Equal(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(equal);

                if (debug) System.out.println("\t" + equal);
            }
            else if (ctx.equal_notequal().getText().equals("!=")) {
                if (debug) System.out.println("Exiting NotEqual");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                NotEqual notEqual = new NotEqual(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(notEqual);

                if (debug) System.out.println("\t" + notEqual);
            }
        }
        else if (ctx.bitand() != null) {
            if (ctx.bitand().getText().equals("&")) {
                if (debug) System.out.println("Exiting BitwiseAnd");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseAnd bitwiseAnd =
                        new BitwiseAnd(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(bitwiseAnd);

                if (debug) System.out.println("\t" + bitwiseAnd);
            }
        }
        else if (ctx.bitxor() != null) {
            if (ctx.bitxor().getText().equals("^")) {
                if (debug) System.out.println("Exiting BitwiseXor");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseXor bitwiseXor =
                        new BitwiseXor(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(bitwiseXor);

                if (debug) System.out.println("\t" + bitwiseXor);
            }
        }
        else if (ctx.bitor() != null) {
            if (ctx.bitor().getText().equals("|")) {
                if (debug) System.out.println("Exiting BitwiseOr");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                BitwiseOr bitwiseOr = new BitwiseOr(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(bitwiseOr);

                if (debug) System.out.println("\t" + bitwiseOr);
            }
        }
        else if (ctx.and() != null) {
            if (ctx.and().getText().equals("&&")) {
                if (debug) System.out.println("Exiting And");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                And and = new And(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(and);

                if (debug) System.out.println("\t" + and);
            }
        }
        else if (ctx.or() != null) {
            if (ctx.or().getText().equals("||")) {
                if (debug) System.out.println("Exiting Or");

                List<Expression> expressions = new ArrayList<>();
                expressions.add((Expression) stack.pop());
                expressions.add((Expression) stack.pop());
                Collections.reverse(expressions);

                Or or = new Or(expressions.get(0), expressions.get(1), blocks.peek(), ctx.getStart());
                stack.push(or);

                if (debug) System.out.println("\t" + or);
            }
        }
    }

    @Override public void enterPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx) { }

    @Override public void exitPostfix_call_subscript(CompilerParser.Postfix_call_subscriptContext ctx) { }

    @Override public void enterPrefix_unary(CompilerParser.Prefix_unaryContext ctx) { }

    @Override public void exitPrefix_unary(CompilerParser.Prefix_unaryContext ctx) { }

    @Override public void enterPow_root(CompilerParser.Pow_rootContext ctx) { }

    @Override public void exitPow_root(CompilerParser.Pow_rootContext ctx) { }

    @Override public void enterMult_div_mod(CompilerParser.Mult_div_modContext ctx) { }

    @Override public void exitMult_div_mod(CompilerParser.Mult_div_modContext ctx) { }

    @Override public void enterAdd_sub(CompilerParser.Add_subContext ctx) { }

    @Override public void exitAdd_sub(CompilerParser.Add_subContext ctx) { }

    @Override public void enterBitleft_right(CompilerParser.Bitleft_rightContext ctx) { }

    @Override public void exitBitleft_right(CompilerParser.Bitleft_rightContext ctx) { }

    @Override public void enterLess_greater(CompilerParser.Less_greaterContext ctx) { }

    @Override public void exitLess_greater(CompilerParser.Less_greaterContext ctx) { }

    @Override public void enterEqual_notequal(CompilerParser.Equal_notequalContext ctx) { }

    @Override public void exitEqual_notequal(CompilerParser.Equal_notequalContext ctx) { }

    @Override public void enterBitand(CompilerParser.BitandContext ctx) { }

    @Override public void exitBitand(CompilerParser.BitandContext ctx) { }

    @Override public void enterBitxor(CompilerParser.BitxorContext ctx) { }

    @Override public void exitBitxor(CompilerParser.BitxorContext ctx) { }

    @Override public void enterBitor(CompilerParser.BitorContext ctx) { }

    @Override public void exitBitor(CompilerParser.BitorContext ctx) { }

    @Override public void enterAnd(CompilerParser.AndContext ctx) { }

    @Override public void exitAnd(CompilerParser.AndContext ctx) { }

    @Override public void enterOr(CompilerParser.OrContext ctx) { }

    @Override public void exitOr(CompilerParser.OrContext ctx) { }

    @Override public void enterType(CompilerParser.TypeContext ctx) { }

	@Override public void exitType(CompilerParser.TypeContext ctx) {
        if (debug) System.out.println("Exiting Type");

        boolean array = false;
        if (ctx.getText().endsWith("[]")) {
            array = true;
        }

        Type type = new Type(ctx.TYPE().getText(), array);
        stack.push(type);

        if (debug) System.out.println("\t" + type);
    }

	@Override public void enterVariable(CompilerParser.VariableContext ctx) { }

	@Override public void exitVariable(CompilerParser.VariableContext ctx) {
        if (debug) System.out.println("Exiting Variable");

        Variable variable = new Variable(ctx.VARIABLE().getText(), blocks.peek(), ctx.getStart());
        stack.push(variable);

        if (debug) System.out.println("\t" + variable);
    }

	@Override public void enterNumber(CompilerParser.NumberContext ctx) { }

	@Override public void exitNumber(CompilerParser.NumberContext ctx) {
        if (debug) System.out.println("Exiting Number");

        Number number = new Number(ctx.NUMBER().getText(), blocks.peek(), ctx.getStart());
        stack.push(number);

        if (debug) System.out.println("\t" + number);
    }

	@Override public void enterString(CompilerParser.StringContext ctx) { }

	@Override public void exitString(CompilerParser.StringContext ctx) {
        if (debug) System.out.println("Exiting String");

        String string = new String(ctx.STRING().getText(), blocks.peek(), ctx.getStart());
        stack.push(string);

        if (debug) System.out.println("\t" + string);
    }

	@Override public void enterCharacter(CompilerParser.CharacterContext ctx) { }

	@Override public void exitCharacter(CompilerParser.CharacterContext ctx) {
        if (debug) System.out.println("Exiting Character");

        Character character = new Character(ctx.CHARACTER().getText(), blocks.peek(), ctx.getStart());
        stack.push(character);

        if (debug) System.out.println("\t" + character);
    }

	@Override public void enterArray(CompilerParser.ArrayContext ctx) { }

	@Override public void exitArray(CompilerParser.ArrayContext ctx) {
        if (debug) System.out.println("Exiting Array");

        List<CompilerParser.ExpressionContext> expressionContexts = ctx.expression();
        List<Expression> expressions = new ArrayList<>();
        for (int i = 0; i < expressionContexts.size(); i++) {
            expressions.add((Expression) stack.pop());
        }
        Collections.reverse(expressions);

        Array array = new Array(expressions, blocks.peek(), ctx.getStart());
        stack.push(array);

        if (debug) System.out.println("\t" + array);
    }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

	@Override public void exitEveryRule(ParserRuleContext ctx) {
        //if (debug) System.out.println(stack);
        //if (debug) System.out.println(ctx.start);
    }

	@Override public void visitTerminal(TerminalNode node) { }

	@Override public void visitErrorNode(ErrorNode node) { }
}