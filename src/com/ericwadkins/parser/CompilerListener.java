// Generated from Compiler.g4 by ANTLR 4.5.3

package com.ericwadkins.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CompilerParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CompilerParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(CompilerParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(CompilerParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#basic_element}.
	 * @param ctx the parse tree
	 */
	void enterBasic_element(CompilerParser.Basic_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#basic_element}.
	 * @param ctx the parse tree
	 */
	void exitBasic_element(CompilerParser.Basic_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#block_element}.
	 * @param ctx the parse tree
	 */
	void enterBlock_element(CompilerParser.Block_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#block_element}.
	 * @param ctx the parse tree
	 */
	void exitBlock_element(CompilerParser.Block_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CompilerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#native_block}.
	 * @param ctx the parse tree
	 */
	void enterNative_block(CompilerParser.Native_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#native_block}.
	 * @param ctx the parse tree
	 */
	void exitNative_block(CompilerParser.Native_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CompilerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CompilerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(CompilerParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(CompilerParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#discarded_statement}.
	 * @param ctx the parse tree
	 */
	void enterDiscarded_statement(CompilerParser.Discarded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#discarded_statement}.
	 * @param ctx the parse tree
	 */
	void exitDiscarded_statement(CompilerParser.Discarded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CompilerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CompilerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#direct_assign}.
	 * @param ctx the parse tree
	 */
	void enterDirect_assign(CompilerParser.Direct_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#direct_assign}.
	 * @param ctx the parse tree
	 */
	void exitDirect_assign(CompilerParser.Direct_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#sum_assign}.
	 * @param ctx the parse tree
	 */
	void enterSum_assign(CompilerParser.Sum_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#sum_assign}.
	 * @param ctx the parse tree
	 */
	void exitSum_assign(CompilerParser.Sum_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#difference_assign}.
	 * @param ctx the parse tree
	 */
	void enterDifference_assign(CompilerParser.Difference_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#difference_assign}.
	 * @param ctx the parse tree
	 */
	void exitDifference_assign(CompilerParser.Difference_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#product_assign}.
	 * @param ctx the parse tree
	 */
	void enterProduct_assign(CompilerParser.Product_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#product_assign}.
	 * @param ctx the parse tree
	 */
	void exitProduct_assign(CompilerParser.Product_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#quotient_assign}.
	 * @param ctx the parse tree
	 */
	void enterQuotient_assign(CompilerParser.Quotient_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#quotient_assign}.
	 * @param ctx the parse tree
	 */
	void exitQuotient_assign(CompilerParser.Quotient_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#modulus_assign}.
	 * @param ctx the parse tree
	 */
	void enterModulus_assign(CompilerParser.Modulus_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#modulus_assign}.
	 * @param ctx the parse tree
	 */
	void exitModulus_assign(CompilerParser.Modulus_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#power_assign}.
	 * @param ctx the parse tree
	 */
	void enterPower_assign(CompilerParser.Power_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#power_assign}.
	 * @param ctx the parse tree
	 */
	void exitPower_assign(CompilerParser.Power_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_left_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_left_assign(CompilerParser.Bit_left_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_left_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_left_assign(CompilerParser.Bit_left_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_right_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_right_assign(CompilerParser.Bit_right_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_right_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_right_assign(CompilerParser.Bit_right_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_and_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_and_assign(CompilerParser.Bit_and_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_and_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_and_assign(CompilerParser.Bit_and_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_xor_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_xor_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor_assign(CompilerParser.Bit_xor_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_or_assign}.
	 * @param ctx the parse tree
	 */
	void enterBit_or_assign(CompilerParser.Bit_or_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_or_assign}.
	 * @param ctx the parse tree
	 */
	void exitBit_or_assign(CompilerParser.Bit_or_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CompilerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CompilerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(CompilerParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(CompilerParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(CompilerParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(CompilerParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(CompilerParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(CompilerParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(CompilerParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(CompilerParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CompilerParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CompilerParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CompilerParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CompilerParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CompilerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CompilerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(CompilerParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(CompilerParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(CompilerParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(CompilerParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CompilerParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CompilerParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_or}.
	 * @param ctx the parse tree
	 */
	void enterBit_or(CompilerParser.Bit_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_or}.
	 * @param ctx the parse tree
	 */
	void exitBit_or(CompilerParser.Bit_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_xor}.
	 * @param ctx the parse tree
	 */
	void enterBit_xor(CompilerParser.Bit_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_xor}.
	 * @param ctx the parse tree
	 */
	void exitBit_xor(CompilerParser.Bit_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_and}.
	 * @param ctx the parse tree
	 */
	void enterBit_and(CompilerParser.Bit_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_and}.
	 * @param ctx the parse tree
	 */
	void exitBit_and(CompilerParser.Bit_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(CompilerParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(CompilerParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CompilerParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CompilerParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#less_than}.
	 * @param ctx the parse tree
	 */
	void enterLess_than(CompilerParser.Less_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#less_than}.
	 * @param ctx the parse tree
	 */
	void exitLess_than(CompilerParser.Less_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than(CompilerParser.Greater_thanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#greater_than}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than(CompilerParser.Greater_thanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#less_than_equal}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_equal(CompilerParser.Less_than_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#less_than_equal}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_equal(CompilerParser.Less_than_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#greater_than_equal}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_equal(CompilerParser.Greater_than_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#greater_than_equal}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_equal(CompilerParser.Greater_than_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal(CompilerParser.Not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal(CompilerParser.Not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CompilerParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CompilerParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_right}.
	 * @param ctx the parse tree
	 */
	void enterBit_right(CompilerParser.Bit_rightContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_right}.
	 * @param ctx the parse tree
	 */
	void exitBit_right(CompilerParser.Bit_rightContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_left}.
	 * @param ctx the parse tree
	 */
	void enterBit_left(CompilerParser.Bit_leftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_left}.
	 * @param ctx the parse tree
	 */
	void exitBit_left(CompilerParser.Bit_leftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#difference}.
	 * @param ctx the parse tree
	 */
	void enterDifference(CompilerParser.DifferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#difference}.
	 * @param ctx the parse tree
	 */
	void exitDifference(CompilerParser.DifferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(CompilerParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(CompilerParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#modulus}.
	 * @param ctx the parse tree
	 */
	void enterModulus(CompilerParser.ModulusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#modulus}.
	 * @param ctx the parse tree
	 */
	void exitModulus(CompilerParser.ModulusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#quotient}.
	 * @param ctx the parse tree
	 */
	void enterQuotient(CompilerParser.QuotientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#quotient}.
	 * @param ctx the parse tree
	 */
	void exitQuotient(CompilerParser.QuotientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(CompilerParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(CompilerParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(CompilerParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(CompilerParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(CompilerParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(CompilerParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#strong_terms}.
	 * @param ctx the parse tree
	 */
	void enterStrong_terms(CompilerParser.Strong_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#strong_terms}.
	 * @param ctx the parse tree
	 */
	void exitStrong_terms(CompilerParser.Strong_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#weak_terms}.
	 * @param ctx the parse tree
	 */
	void enterWeak_terms(CompilerParser.Weak_termsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#weak_terms}.
	 * @param ctx the parse tree
	 */
	void exitWeak_terms(CompilerParser.Weak_termsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operation(CompilerParser.Unary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operation(CompilerParser.Unary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#increment_postfix}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_postfix(CompilerParser.Increment_postfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#increment_postfix}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_postfix(CompilerParser.Increment_postfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#decrement_postfix}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_postfix(CompilerParser.Decrement_postfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#decrement_postfix}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_postfix(CompilerParser.Decrement_postfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#increment_prefix}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_prefix(CompilerParser.Increment_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#increment_prefix}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_prefix(CompilerParser.Increment_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#decrement_prefix}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_prefix(CompilerParser.Decrement_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#decrement_prefix}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_prefix(CompilerParser.Decrement_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CompilerParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CompilerParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(CompilerParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(CompilerParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bit_not}.
	 * @param ctx the parse tree
	 */
	void enterBit_not(CompilerParser.Bit_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bit_not}.
	 * @param ctx the parse tree
	 */
	void exitBit_not(CompilerParser.Bit_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CompilerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CompilerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CompilerParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CompilerParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CompilerParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CompilerParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CompilerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CompilerParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(CompilerParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(CompilerParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(CompilerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(CompilerParser.ArrayContext ctx);
}