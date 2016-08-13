// Generated from Compiler.g4 by ANTLR 4.5.3

package com.ericwadkins.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, NATIVE=44, IF=45, ELSE=46, 
		RETURN=47, TYPE=48, VARIABLE=49, NUMBER=50, STRING=51, CHARACTER=52, WHITESPACE=53;
	public static final int
		RULE_root = 0, RULE_element = 1, RULE_block = 2, RULE_native_block = 3, 
		RULE_declaration = 4, RULE_instantiation = 5, RULE_discarded_statement = 6, 
		RULE_assignment = 7, RULE_direct_assign = 8, RULE_sum_assign = 9, RULE_difference_assign = 10, 
		RULE_product_assign = 11, RULE_quotient_assign = 12, RULE_modulus_assign = 13, 
		RULE_power_assign = 14, RULE_bit_left_assign = 15, RULE_bit_right_assign = 16, 
		RULE_bit_and_assign = 17, RULE_bit_xor_assign = 18, RULE_bit_or_assign = 19, 
		RULE_if_statement = 20, RULE_else_if_statement = 21, RULE_else_statement = 22, 
		RULE_function = 23, RULE_return_statement = 24, RULE_expression = 25, 
		RULE_operand = 26, RULE_operation = 27, RULE_call = 28, RULE_bit_or = 29, 
		RULE_bit_xor = 30, RULE_bit_and = 31, RULE_or = 32, RULE_and = 33, RULE_less_than = 34, 
		RULE_greater_than = 35, RULE_less_than_equal = 36, RULE_greater_than_equal = 37, 
		RULE_not_equal = 38, RULE_equal = 39, RULE_bit_right = 40, RULE_bit_left = 41, 
		RULE_difference = 42, RULE_sum = 43, RULE_modulus = 44, RULE_quotient = 45, 
		RULE_product = 46, RULE_power = 47, RULE_subscript = 48, RULE_strong_terms = 49, 
		RULE_weak_terms = 50, RULE_unary_operation = 51, RULE_increment_postfix = 52, 
		RULE_decrement_postfix = 53, RULE_increment_prefix = 54, RULE_decrement_prefix = 55, 
		RULE_negate = 56, RULE_not = 57, RULE_bit_not = 58, RULE_type = 59, RULE_variable = 60, 
		RULE_number = 61, RULE_string = 62, RULE_character = 63, RULE_array = 64;
	public static final String[] ruleNames = {
		"root", "element", "block", "native_block", "declaration", "instantiation", 
		"discarded_statement", "assignment", "direct_assign", "sum_assign", "difference_assign", 
		"product_assign", "quotient_assign", "modulus_assign", "power_assign", 
		"bit_left_assign", "bit_right_assign", "bit_and_assign", "bit_xor_assign", 
		"bit_or_assign", "if_statement", "else_if_statement", "else_statement", 
		"function", "return_statement", "expression", "operand", "operation", 
		"call", "bit_or", "bit_xor", "bit_and", "or", "and", "less_than", "greater_than", 
		"less_than_equal", "greater_than_equal", "not_equal", "equal", "bit_right", 
		"bit_left", "difference", "sum", "modulus", "quotient", "product", "power", 
		"subscript", "strong_terms", "weak_terms", "unary_operation", "increment_postfix", 
		"decrement_postfix", "increment_prefix", "decrement_prefix", "negate", 
		"not", "bit_not", "type", "variable", "number", "string", "character", 
		"array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'**='", "'<<='", "'&='", "'^='", "'|='", "'('", "')'", "','", "'|'", 
		"'^'", "'&'", "'||'", "'&&'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", 
		"'>>'", "'<<'", "'-'", "'+'", "'%'", "'/'", "'*'", "'**'", "'['", "']'", 
		"'++'", "'--'", "'!'", "'~'", "'[]'", "'native'", "'if'", "'else'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "NATIVE", "IF", "ELSE", 
		"RETURN", "TYPE", "VARIABLE", "NUMBER", "STRING", "CHARACTER", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public void reportErrorsAsExceptions() {
	        // To prevent default report to standard error, add this line:
	        removeErrorListeners();
	        
	        addErrorListener(new BaseErrorListener() {
	            public void syntaxError(Recognizer<?, ?> recognizer,
	                                    Object offendingSymbol,
	                                    int line, int charPositionInLine,
	                                    String msg, RecognitionException e) {

	                //throw new ParseCancellationException(msg, e);
	                System.err.println("Invalid character: '" + ((CommonToken) offendingSymbol).getText() + "' on line: " + line + ", index: " + charPositionInLine);
	                System.err.println(msg);
	                System.exit(1);
	            }
	        });
	    }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CompilerParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << NATIVE) | (1L << IF) | (1L << RETURN) | (1L << TYPE) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(130);
				element();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Discarded_statementContext discarded_statement() {
			return getRuleContext(Discarded_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Else_if_statementContext> else_if_statement() {
			return getRuleContexts(Else_if_statementContext.class);
		}
		public Else_if_statementContext else_if_statement(int i) {
			return getRuleContext(Else_if_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Native_blockContext native_block() {
			return getRuleContext(Native_blockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			int _alt;
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				discarded_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				if_statement();
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						else_if_statement();
						}
						} 
					}
					setState(148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(149);
					else_statement();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				function();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(155);
				native_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__14) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << NATIVE) | (1L << IF) | (1L << RETURN) | (1L << TYPE) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(159);
				element();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Native_blockContext extends ParserRuleContext {
		public TerminalNode NATIVE() { return getToken(CompilerParser.NATIVE, 0); }
		public Native_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_native_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNative_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNative_block(this);
		}
	}

	public final Native_blockContext native_block() throws RecognitionException {
		Native_blockContext _localctx = new Native_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_native_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NATIVE);
			setState(168);
			match(T__0);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(169);
					matchWildcard();
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(175);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			type();
			setState(178);
			variable();
			setState(179);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstantiationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitInstantiation(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			type();
			setState(182);
			variable();
			setState(183);
			match(T__3);
			setState(184);
			expression();
			setState(185);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Discarded_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Discarded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discarded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDiscarded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDiscarded_statement(this);
		}
	}

	public final Discarded_statementContext discarded_statement() throws RecognitionException {
		Discarded_statementContext _localctx = new Discarded_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_discarded_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			expression();
			setState(188);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Direct_assignContext direct_assign() {
			return getRuleContext(Direct_assignContext.class,0);
		}
		public Sum_assignContext sum_assign() {
			return getRuleContext(Sum_assignContext.class,0);
		}
		public Difference_assignContext difference_assign() {
			return getRuleContext(Difference_assignContext.class,0);
		}
		public Product_assignContext product_assign() {
			return getRuleContext(Product_assignContext.class,0);
		}
		public Quotient_assignContext quotient_assign() {
			return getRuleContext(Quotient_assignContext.class,0);
		}
		public Modulus_assignContext modulus_assign() {
			return getRuleContext(Modulus_assignContext.class,0);
		}
		public Power_assignContext power_assign() {
			return getRuleContext(Power_assignContext.class,0);
		}
		public Bit_left_assignContext bit_left_assign() {
			return getRuleContext(Bit_left_assignContext.class,0);
		}
		public Bit_right_assignContext bit_right_assign() {
			return getRuleContext(Bit_right_assignContext.class,0);
		}
		public Bit_and_assignContext bit_and_assign() {
			return getRuleContext(Bit_and_assignContext.class,0);
		}
		public Bit_xor_assignContext bit_xor_assign() {
			return getRuleContext(Bit_xor_assignContext.class,0);
		}
		public Bit_or_assignContext bit_or_assign() {
			return getRuleContext(Bit_or_assignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				direct_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				sum_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				difference_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				product_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				quotient_assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				modulus_assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(196);
				power_assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				bit_left_assign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(198);
				bit_right_assign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(199);
				bit_and_assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(200);
				bit_xor_assign();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(201);
				bit_or_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Direct_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Direct_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direct_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDirect_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDirect_assign(this);
		}
	}

	public final Direct_assignContext direct_assign() throws RecognitionException {
		Direct_assignContext _localctx = new Direct_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_direct_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			variable();
			setState(205);
			match(T__3);
			setState(206);
			expression();
			setState(207);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sum_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Sum_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSum_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSum_assign(this);
		}
	}

	public final Sum_assignContext sum_assign() throws RecognitionException {
		Sum_assignContext _localctx = new Sum_assignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sum_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			variable();
			setState(210);
			match(T__4);
			setState(211);
			expression();
			setState(212);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Difference_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Difference_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDifference_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDifference_assign(this);
		}
	}

	public final Difference_assignContext difference_assign() throws RecognitionException {
		Difference_assignContext _localctx = new Difference_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_difference_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			variable();
			setState(215);
			match(T__5);
			setState(216);
			expression();
			setState(217);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Product_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Product_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterProduct_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitProduct_assign(this);
		}
	}

	public final Product_assignContext product_assign() throws RecognitionException {
		Product_assignContext _localctx = new Product_assignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_product_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			variable();
			setState(220);
			match(T__6);
			setState(221);
			expression();
			setState(222);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quotient_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Quotient_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterQuotient_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitQuotient_assign(this);
		}
	}

	public final Quotient_assignContext quotient_assign() throws RecognitionException {
		Quotient_assignContext _localctx = new Quotient_assignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quotient_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variable();
			setState(225);
			match(T__7);
			setState(226);
			expression();
			setState(227);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modulus_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Modulus_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterModulus_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitModulus_assign(this);
		}
	}

	public final Modulus_assignContext modulus_assign() throws RecognitionException {
		Modulus_assignContext _localctx = new Modulus_assignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modulus_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			variable();
			setState(230);
			match(T__8);
			setState(231);
			expression();
			setState(232);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Power_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Power_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPower_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPower_assign(this);
		}
	}

	public final Power_assignContext power_assign() throws RecognitionException {
		Power_assignContext _localctx = new Power_assignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_power_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			variable();
			setState(235);
			match(T__9);
			setState(236);
			expression();
			setState(237);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_left_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_left_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_left_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_left_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_left_assign(this);
		}
	}

	public final Bit_left_assignContext bit_left_assign() throws RecognitionException {
		Bit_left_assignContext _localctx = new Bit_left_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bit_left_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			variable();
			setState(240);
			match(T__10);
			setState(241);
			expression();
			setState(242);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_right_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_right_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_right_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_right_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_right_assign(this);
		}
	}

	public final Bit_right_assignContext bit_right_assign() throws RecognitionException {
		Bit_right_assignContext _localctx = new Bit_right_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bit_right_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			variable();
			setState(245);
			match(T__10);
			setState(246);
			expression();
			setState(247);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_and_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_and_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_and_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_and_assign(this);
		}
	}

	public final Bit_and_assignContext bit_and_assign() throws RecognitionException {
		Bit_and_assignContext _localctx = new Bit_and_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bit_and_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			variable();
			setState(250);
			match(T__11);
			setState(251);
			expression();
			setState(252);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_xor_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_xor_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_xor_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_xor_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_xor_assign(this);
		}
	}

	public final Bit_xor_assignContext bit_xor_assign() throws RecognitionException {
		Bit_xor_assignContext _localctx = new Bit_xor_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bit_xor_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			variable();
			setState(255);
			match(T__12);
			setState(256);
			expression();
			setState(257);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_or_assignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bit_or_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_or_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_or_assign(this);
		}
	}

	public final Bit_or_assignContext bit_or_assign() throws RecognitionException {
		Bit_or_assignContext _localctx = new Bit_or_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bit_or_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			variable();
			setState(260);
			match(T__13);
			setState(261);
			expression();
			setState(262);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompilerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IF);
			setState(265);
			match(T__14);
			setState(266);
			expression();
			setState(267);
			match(T__15);
			setState(268);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CompilerParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Else_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElse_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElse_if_statement(this);
		}
	}

	public final Else_if_statementContext else_if_statement() throws RecognitionException {
		Else_if_statementContext _localctx = new Else_if_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ELSE);
			setState(271);
			match(IF);
			setState(272);
			match(T__14);
			setState(273);
			expression();
			setState(274);
			match(T__15);
			setState(275);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CompilerParser.ELSE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ELSE);
			setState(278);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			type();
			setState(281);
			variable();
			{
			setState(282);
			match(T__14);
			setState(295);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						type();
						setState(284);
						variable();
						setState(285);
						match(T__16);
						}
						} 
					}
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(292);
				type();
				setState(293);
				variable();
				}
			}

			setState(297);
			match(T__15);
			}
			setState(299);
			element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CompilerParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RETURN);
			setState(302);
			expression();
			setState(303);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(305);
				match(T__14);
				setState(306);
				expression();
				setState(307);
				match(T__15);
				}
				break;
			case 2:
				{
				setState(309);
				operand();
				}
				break;
			case 3:
				{
				setState(310);
				operation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operand);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				string();
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				character();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				array();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Bit_orContext> bit_or() {
			return getRuleContexts(Bit_orContext.class);
		}
		public Bit_orContext bit_or(int i) {
			return getRuleContext(Bit_orContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(322);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(323);
				bit_or();
				}
				break;
			}
			setState(345);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(326);
				match(T__14);
				setState(342);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
					{
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(329);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
							case 1:
								{
								setState(327);
								weak_terms();
								}
								break;
							case 2:
								{
								setState(328);
								bit_or();
								}
								break;
							}
							setState(331);
							match(T__16);
							}
							} 
						}
						setState(337);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(338);
						weak_terms();
						}
						break;
					case 2:
						{
						setState(339);
						bit_or();
						}
						break;
					}
					}
				}

				setState(344);
				match(T__15);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_orContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Bit_xorContext> bit_xor() {
			return getRuleContexts(Bit_xorContext.class);
		}
		public Bit_xorContext bit_xor(int i) {
			return getRuleContext(Bit_xorContext.class,i);
		}
		public Bit_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_or(this);
		}
	}

	public final Bit_orContext bit_or() throws RecognitionException {
		Bit_orContext _localctx = new Bit_orContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bit_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(347);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(348);
				bit_xor();
				}
				break;
			}
			setState(356);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(351);
				match(T__17);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(352);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(353);
					bit_xor();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_xorContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Bit_andContext> bit_and() {
			return getRuleContexts(Bit_andContext.class);
		}
		public Bit_andContext bit_and(int i) {
			return getRuleContext(Bit_andContext.class,i);
		}
		public Bit_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_xor(this);
		}
	}

	public final Bit_xorContext bit_xor() throws RecognitionException {
		Bit_xorContext _localctx = new Bit_xorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bit_xor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(358);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(359);
				bit_and();
				}
				break;
			}
			setState(367);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(362);
				match(T__18);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(363);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(364);
					bit_and();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_andContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public Bit_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_and(this);
		}
	}

	public final Bit_andContext bit_and() throws RecognitionException {
		Bit_andContext _localctx = new Bit_andContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bit_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(369);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(370);
				or();
				}
				break;
			}
			setState(378);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(373);
				match(T__19);
				setState(376);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(374);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(375);
					or();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(380);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(381);
				and();
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(384);
				match(T__20);
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(385);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(386);
					and();
					}
					break;
				}
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Less_thanContext> less_than() {
			return getRuleContexts(Less_thanContext.class);
		}
		public Less_thanContext less_than(int i) {
			return getRuleContext(Less_thanContext.class,i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(394);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(395);
				less_than();
				}
				break;
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(398);
				match(T__21);
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(399);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(400);
					less_than();
					}
					break;
				}
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_thanContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Greater_thanContext> greater_than() {
			return getRuleContexts(Greater_thanContext.class);
		}
		public Greater_thanContext greater_than(int i) {
			return getRuleContext(Greater_thanContext.class,i);
		}
		public Less_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterLess_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitLess_than(this);
		}
	}

	public final Less_thanContext less_than() throws RecognitionException {
		Less_thanContext _localctx = new Less_thanContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_less_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(408);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(409);
				greater_than();
				}
				break;
			}
			setState(417);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(412);
				match(T__22);
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(413);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(414);
					greater_than();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_thanContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Less_than_equalContext> less_than_equal() {
			return getRuleContexts(Less_than_equalContext.class);
		}
		public Less_than_equalContext less_than_equal(int i) {
			return getRuleContext(Less_than_equalContext.class,i);
		}
		public Greater_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterGreater_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitGreater_than(this);
		}
	}

	public final Greater_thanContext greater_than() throws RecognitionException {
		Greater_thanContext _localctx = new Greater_thanContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_greater_than);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(419);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(420);
				less_than_equal();
				}
				break;
			}
			setState(428);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(423);
				match(T__23);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(424);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(425);
					less_than_equal();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_than_equalContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Greater_than_equalContext> greater_than_equal() {
			return getRuleContexts(Greater_than_equalContext.class);
		}
		public Greater_than_equalContext greater_than_equal(int i) {
			return getRuleContext(Greater_than_equalContext.class,i);
		}
		public Less_than_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterLess_than_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitLess_than_equal(this);
		}
	}

	public final Less_than_equalContext less_than_equal() throws RecognitionException {
		Less_than_equalContext _localctx = new Less_than_equalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_less_than_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(430);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(431);
				greater_than_equal();
				}
				break;
			}
			setState(439);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(434);
				match(T__24);
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(435);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(436);
					greater_than_equal();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_than_equalContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Not_equalContext> not_equal() {
			return getRuleContexts(Not_equalContext.class);
		}
		public Not_equalContext not_equal(int i) {
			return getRuleContext(Not_equalContext.class,i);
		}
		public Greater_than_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_than_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterGreater_than_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitGreater_than_equal(this);
		}
	}

	public final Greater_than_equalContext greater_than_equal() throws RecognitionException {
		Greater_than_equalContext _localctx = new Greater_than_equalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_greater_than_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(441);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(442);
				not_equal();
				}
				break;
			}
			setState(450);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(445);
				match(T__25);
				setState(448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(446);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(447);
					not_equal();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<EqualContext> equal() {
			return getRuleContexts(EqualContext.class);
		}
		public EqualContext equal(int i) {
			return getRuleContext(EqualContext.class,i);
		}
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNot_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNot_equal(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_not_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(452);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(453);
				equal();
				}
				break;
			}
			setState(461);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(456);
				match(T__26);
				setState(459);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(457);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(458);
					equal();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Bit_rightContext> bit_right() {
			return getRuleContexts(Bit_rightContext.class);
		}
		public Bit_rightContext bit_right(int i) {
			return getRuleContext(Bit_rightContext.class,i);
		}
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(463);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(464);
				bit_right();
				}
				break;
			}
			setState(472);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(467);
				match(T__27);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(468);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(469);
					bit_right();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_rightContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<Bit_leftContext> bit_left() {
			return getRuleContexts(Bit_leftContext.class);
		}
		public Bit_leftContext bit_left(int i) {
			return getRuleContext(Bit_leftContext.class,i);
		}
		public Bit_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_right(this);
		}
	}

	public final Bit_rightContext bit_right() throws RecognitionException {
		Bit_rightContext _localctx = new Bit_rightContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bit_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(474);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(475);
				bit_left();
				}
				break;
			}
			setState(483);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(478);
				match(T__28);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(479);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(480);
					bit_left();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_leftContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<DifferenceContext> difference() {
			return getRuleContexts(DifferenceContext.class);
		}
		public DifferenceContext difference(int i) {
			return getRuleContext(DifferenceContext.class,i);
		}
		public Bit_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_left(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_left(this);
		}
	}

	public final Bit_leftContext bit_left() throws RecognitionException {
		Bit_leftContext _localctx = new Bit_leftContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bit_left);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(485);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(486);
				difference();
				}
				break;
			}
			setState(494);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(489);
				match(T__29);
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(490);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(491);
					difference();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferenceContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public DifferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_difference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDifference(this);
		}
	}

	public final DifferenceContext difference() throws RecognitionException {
		DifferenceContext _localctx = new DifferenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_difference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(496);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(497);
				sum();
				}
				break;
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(500);
				match(T__30);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(501);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(502);
					sum();
					}
					break;
				}
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public List<Weak_termsContext> weak_terms() {
			return getRuleContexts(Weak_termsContext.class);
		}
		public Weak_termsContext weak_terms(int i) {
			return getRuleContext(Weak_termsContext.class,i);
		}
		public List<ModulusContext> modulus() {
			return getRuleContexts(ModulusContext.class);
		}
		public ModulusContext modulus(int i) {
			return getRuleContext(ModulusContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(510);
				weak_terms();
				}
				break;
			case 2:
				{
				setState(511);
				modulus();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(514);
				match(T__31);
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(515);
					weak_terms();
					}
					break;
				case 2:
					{
					setState(516);
					modulus();
					}
					break;
				}
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModulusContext extends ParserRuleContext {
		public List<Strong_termsContext> strong_terms() {
			return getRuleContexts(Strong_termsContext.class);
		}
		public Strong_termsContext strong_terms(int i) {
			return getRuleContext(Strong_termsContext.class,i);
		}
		public List<QuotientContext> quotient() {
			return getRuleContexts(QuotientContext.class);
		}
		public QuotientContext quotient(int i) {
			return getRuleContext(QuotientContext.class,i);
		}
		public ModulusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitModulus(this);
		}
	}

	public final ModulusContext modulus() throws RecognitionException {
		ModulusContext _localctx = new ModulusContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_modulus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(524);
				strong_terms();
				}
				break;
			case 2:
				{
				setState(525);
				quotient();
				}
				break;
			}
			setState(533);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(528);
				match(T__32);
				setState(531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(529);
					strong_terms();
					}
					break;
				case 2:
					{
					setState(530);
					quotient();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotientContext extends ParserRuleContext {
		public List<Strong_termsContext> strong_terms() {
			return getRuleContexts(Strong_termsContext.class);
		}
		public Strong_termsContext strong_terms(int i) {
			return getRuleContext(Strong_termsContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public QuotientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotient; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterQuotient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitQuotient(this);
		}
	}

	public final QuotientContext quotient() throws RecognitionException {
		QuotientContext _localctx = new QuotientContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_quotient);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(535);
				strong_terms();
				}
				break;
			case 2:
				{
				setState(536);
				product();
				}
				break;
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(539);
				match(T__33);
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(540);
					strong_terms();
					}
					break;
				case 2:
					{
					setState(541);
					product();
					}
					break;
				}
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public List<Strong_termsContext> strong_terms() {
			return getRuleContexts(Strong_termsContext.class);
		}
		public Strong_termsContext strong_terms(int i) {
			return getRuleContext(Strong_termsContext.class,i);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(549);
				strong_terms();
				}
				break;
			case 2:
				{
				setState(550);
				power();
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(553);
				match(T__34);
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(554);
					strong_terms();
					}
					break;
				case 2:
					{
					setState(555);
					power();
					}
					break;
				}
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public List<Strong_termsContext> strong_terms() {
			return getRuleContexts(Strong_termsContext.class);
		}
		public Strong_termsContext strong_terms(int i) {
			return getRuleContext(Strong_termsContext.class,i);
		}
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(563);
				strong_terms();
				}
				break;
			case 2:
				{
				setState(564);
				subscript();
				}
				break;
			}
			setState(572);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(567);
				match(T__35);
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(568);
					strong_terms();
					}
					break;
				case 2:
					{
					setState(569);
					subscript();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public List<Strong_termsContext> strong_terms() {
			return getRuleContexts(Strong_termsContext.class);
		}
		public Strong_termsContext strong_terms(int i) {
			return getRuleContext(Strong_termsContext.class,i);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSubscript(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_subscript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(574);
			strong_terms();
			}
			setState(579);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(575);
				match(T__36);
				{
				setState(576);
				strong_terms();
				}
				setState(577);
				match(T__37);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Strong_termsContext extends ParserRuleContext {
		public Unary_operationContext unary_operation() {
			return getRuleContext(Unary_operationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Strong_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strong_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStrong_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStrong_terms(this);
		}
	}

	public final Strong_termsContext strong_terms() throws RecognitionException {
		Strong_termsContext _localctx = new Strong_termsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_strong_terms);
		try {
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				unary_operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				match(T__14);
				setState(583);
				expression();
				setState(584);
				match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				operand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Weak_termsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Weak_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterWeak_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitWeak_terms(this);
		}
	}

	public final Weak_termsContext weak_terms() throws RecognitionException {
		Weak_termsContext _localctx = new Weak_termsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_weak_terms);
		try {
			setState(594);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(T__14);
				setState(590);
				expression();
				setState(591);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operationContext extends ParserRuleContext {
		public Increment_postfixContext increment_postfix() {
			return getRuleContext(Increment_postfixContext.class,0);
		}
		public Decrement_postfixContext decrement_postfix() {
			return getRuleContext(Decrement_postfixContext.class,0);
		}
		public Increment_prefixContext increment_prefix() {
			return getRuleContext(Increment_prefixContext.class,0);
		}
		public Decrement_prefixContext decrement_prefix() {
			return getRuleContext(Decrement_prefixContext.class,0);
		}
		public NegateContext negate() {
			return getRuleContext(NegateContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public Bit_notContext bit_not() {
			return getRuleContext(Bit_notContext.class,0);
		}
		public Unary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterUnary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitUnary_operation(this);
		}
	}

	public final Unary_operationContext unary_operation() throws RecognitionException {
		Unary_operationContext _localctx = new Unary_operationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unary_operation);
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				increment_postfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				decrement_postfix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				increment_prefix();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				decrement_prefix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				negate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				not();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(602);
				bit_not();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_postfixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Increment_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIncrement_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIncrement_postfix(this);
		}
	}

	public final Increment_postfixContext increment_postfix() throws RecognitionException {
		Increment_postfixContext _localctx = new Increment_postfixContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_increment_postfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(605);
				match(T__14);
				setState(606);
				expression();
				setState(607);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(609);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(612);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decrement_postfixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Decrement_postfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDecrement_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDecrement_postfix(this);
		}
	}

	public final Decrement_postfixContext decrement_postfix() throws RecognitionException {
		Decrement_postfixContext _localctx = new Decrement_postfixContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_decrement_postfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(614);
				match(T__14);
				setState(615);
				expression();
				setState(616);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(618);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_prefixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Increment_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIncrement_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIncrement_prefix(this);
		}
	}

	public final Increment_prefixContext increment_prefix() throws RecognitionException {
		Increment_prefixContext _localctx = new Increment_prefixContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_increment_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__38);
			setState(629);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(624);
				match(T__14);
				setState(625);
				expression();
				setState(626);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(628);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decrement_prefixContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Decrement_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDecrement_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDecrement_prefix(this);
		}
	}

	public final Decrement_prefixContext decrement_prefix() throws RecognitionException {
		Decrement_prefixContext _localctx = new Decrement_prefixContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_decrement_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(T__39);
			setState(637);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(632);
				match(T__14);
				setState(633);
				expression();
				setState(634);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(636);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NegateContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public NegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNegate(this);
		}
	}

	public final NegateContext negate() throws RecognitionException {
		NegateContext _localctx = new NegateContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_negate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(T__30);
			setState(645);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(640);
				match(T__14);
				setState(641);
				expression();
				setState(642);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(644);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T__40);
			setState(653);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(648);
				match(T__14);
				setState(649);
				expression();
				setState(650);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(652);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bit_notContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Bit_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBit_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBit_not(this);
		}
	}

	public final Bit_notContext bit_not() throws RecognitionException {
		Bit_notContext _localctx = new Bit_notContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bit_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(T__41);
			setState(661);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(656);
				match(T__14);
				setState(657);
				expression();
				setState(658);
				match(T__15);
				}
				break;
			case T__36:
			case VARIABLE:
			case NUMBER:
			case STRING:
			case CHARACTER:
				{
				setState(660);
				operand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(CompilerParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(TYPE);
			setState(665);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(664);
				match(T__42);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CompilerParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CompilerParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CompilerParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(CompilerParser.CHARACTER, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(CHARACTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(T__36);
			setState(685);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(676);
						expression();
						setState(677);
						match(T__16);
						}
						} 
					}
					setState(683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				setState(684);
				expression();
				}
			}

			setState(687);
			match(T__37);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u02b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0093\n\3\f\3\16\3\u0096\13\3\3\3\5"+
		"\3\u0099\n\3\3\3\3\3\3\3\3\3\5\3\u009f\n\3\3\4\3\4\7\4\u00a3\n\4\f\4\16"+
		"\4\u00a6\13\4\3\4\3\4\3\5\3\5\3\5\7\5\u00ad\n\5\f\5\16\5\u00b0\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0122\n\31\f\31\16\31\u0125\13\31"+
		"\3\31\3\31\3\31\5\31\u012a\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013a\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0141\n\34\3\35\3\35\3\36\3\36\5\36\u0147\n\36\3\36\3\36\3\36\5"+
		"\36\u014c\n\36\3\36\3\36\7\36\u0150\n\36\f\36\16\36\u0153\13\36\3\36\3"+
		"\36\5\36\u0157\n\36\5\36\u0159\n\36\3\36\5\36\u015c\n\36\3\37\3\37\5\37"+
		"\u0160\n\37\3\37\3\37\3\37\5\37\u0165\n\37\5\37\u0167\n\37\3 \3 \5 \u016b"+
		"\n \3 \3 \3 \5 \u0170\n \5 \u0172\n \3!\3!\5!\u0176\n!\3!\3!\3!\5!\u017b"+
		"\n!\5!\u017d\n!\3\"\3\"\5\"\u0181\n\"\3\"\3\"\3\"\5\"\u0186\n\"\7\"\u0188"+
		"\n\"\f\"\16\"\u018b\13\"\3#\3#\5#\u018f\n#\3#\3#\3#\5#\u0194\n#\7#\u0196"+
		"\n#\f#\16#\u0199\13#\3$\3$\5$\u019d\n$\3$\3$\3$\5$\u01a2\n$\5$\u01a4\n"+
		"$\3%\3%\5%\u01a8\n%\3%\3%\3%\5%\u01ad\n%\5%\u01af\n%\3&\3&\5&\u01b3\n"+
		"&\3&\3&\3&\5&\u01b8\n&\5&\u01ba\n&\3\'\3\'\5\'\u01be\n\'\3\'\3\'\3\'\5"+
		"\'\u01c3\n\'\5\'\u01c5\n\'\3(\3(\5(\u01c9\n(\3(\3(\3(\5(\u01ce\n(\5(\u01d0"+
		"\n(\3)\3)\5)\u01d4\n)\3)\3)\3)\5)\u01d9\n)\5)\u01db\n)\3*\3*\5*\u01df"+
		"\n*\3*\3*\3*\5*\u01e4\n*\5*\u01e6\n*\3+\3+\5+\u01ea\n+\3+\3+\3+\5+\u01ef"+
		"\n+\5+\u01f1\n+\3,\3,\5,\u01f5\n,\3,\3,\3,\5,\u01fa\n,\7,\u01fc\n,\f,"+
		"\16,\u01ff\13,\3-\3-\5-\u0203\n-\3-\3-\3-\5-\u0208\n-\7-\u020a\n-\f-\16"+
		"-\u020d\13-\3.\3.\5.\u0211\n.\3.\3.\3.\5.\u0216\n.\5.\u0218\n.\3/\3/\5"+
		"/\u021c\n/\3/\3/\3/\5/\u0221\n/\7/\u0223\n/\f/\16/\u0226\13/\3\60\3\60"+
		"\5\60\u022a\n\60\3\60\3\60\3\60\5\60\u022f\n\60\7\60\u0231\n\60\f\60\16"+
		"\60\u0234\13\60\3\61\3\61\5\61\u0238\n\61\3\61\3\61\3\61\5\61\u023d\n"+
		"\61\5\61\u023f\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u0246\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\5\63\u024e\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0255"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u025e\n\65\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0265\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u026e"+
		"\n\67\3\67\3\67\38\38\38\38\38\38\58\u0278\n8\39\39\39\39\39\39\59\u0280"+
		"\n9\3:\3:\3:\3:\3:\3:\5:\u0288\n:\3;\3;\3;\3;\3;\3;\5;\u0290\n;\3<\3<"+
		"\3<\3<\3<\3<\5<\u0298\n<\3=\3=\5=\u029c\n=\3>\3>\3?\3?\3@\3@\3A\3A\3B"+
		"\3B\3B\3B\7B\u02aa\nB\fB\16B\u02ad\13B\3B\5B\u02b0\nB\3B\3B\3B\3\u00ae"+
		"\2C\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\2\2\u02e5\2\u0087\3\2\2\2"+
		"\4\u009e\3\2\2\2\6\u00a0\3\2\2\2\b\u00a9\3\2\2\2\n\u00b3\3\2\2\2\f\u00b7"+
		"\3\2\2\2\16\u00bd\3\2\2\2\20\u00cc\3\2\2\2\22\u00ce\3\2\2\2\24\u00d3\3"+
		"\2\2\2\26\u00d8\3\2\2\2\30\u00dd\3\2\2\2\32\u00e2\3\2\2\2\34\u00e7\3\2"+
		"\2\2\36\u00ec\3\2\2\2 \u00f1\3\2\2\2\"\u00f6\3\2\2\2$\u00fb\3\2\2\2&\u0100"+
		"\3\2\2\2(\u0105\3\2\2\2*\u010a\3\2\2\2,\u0110\3\2\2\2.\u0117\3\2\2\2\60"+
		"\u011a\3\2\2\2\62\u012f\3\2\2\2\64\u0139\3\2\2\2\66\u0140\3\2\2\28\u0142"+
		"\3\2\2\2:\u0146\3\2\2\2<\u015f\3\2\2\2>\u016a\3\2\2\2@\u0175\3\2\2\2B"+
		"\u0180\3\2\2\2D\u018e\3\2\2\2F\u019c\3\2\2\2H\u01a7\3\2\2\2J\u01b2\3\2"+
		"\2\2L\u01bd\3\2\2\2N\u01c8\3\2\2\2P\u01d3\3\2\2\2R\u01de\3\2\2\2T\u01e9"+
		"\3\2\2\2V\u01f4\3\2\2\2X\u0202\3\2\2\2Z\u0210\3\2\2\2\\\u021b\3\2\2\2"+
		"^\u0229\3\2\2\2`\u0237\3\2\2\2b\u0240\3\2\2\2d\u024d\3\2\2\2f\u0254\3"+
		"\2\2\2h\u025d\3\2\2\2j\u0264\3\2\2\2l\u026d\3\2\2\2n\u0271\3\2\2\2p\u0279"+
		"\3\2\2\2r\u0281\3\2\2\2t\u0289\3\2\2\2v\u0291\3\2\2\2x\u0299\3\2\2\2z"+
		"\u029d\3\2\2\2|\u029f\3\2\2\2~\u02a1\3\2\2\2\u0080\u02a3\3\2\2\2\u0082"+
		"\u02a5\3\2\2\2\u0084\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\2\2\3\u008b\3\3\2\2\2\u008c\u009f\5\n\6\2"+
		"\u008d\u009f\5\f\7\2\u008e\u009f\5\20\t\2\u008f\u009f\5\16\b\2\u0090\u0094"+
		"\5*\26\2\u0091\u0093\5,\27\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\5.\30\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009f\3\2\2\2\u009a\u009f\5\60\31\2\u009b\u009f\5\62\32\2\u009c\u009f"+
		"\5\6\4\2\u009d\u009f\5\b\5\2\u009e\u008c\3\2\2\2\u009e\u008d\3\2\2\2\u009e"+
		"\u008e\3\2\2\2\u009e\u008f\3\2\2\2\u009e\u0090\3\2\2\2\u009e\u009a\3\2"+
		"\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\5\3\2\2\2\u00a0\u00a4\7\3\2\2\u00a1\u00a3\5\4\3\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\7\3\2\2\2\u00a9"+
		"\u00aa\7.\2\2\u00aa\u00ae\7\3\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\t\3\2\2\2"+
		"\u00b3\u00b4\5x=\2\u00b4\u00b5\5z>\2\u00b5\u00b6\7\5\2\2\u00b6\13\3\2"+
		"\2\2\u00b7\u00b8\5x=\2\u00b8\u00b9\5z>\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb"+
		"\5\64\33\2\u00bb\u00bc\7\5\2\2\u00bc\r\3\2\2\2\u00bd\u00be\5\64\33\2\u00be"+
		"\u00bf\7\5\2\2\u00bf\17\3\2\2\2\u00c0\u00cd\5\22\n\2\u00c1\u00cd\5\24"+
		"\13\2\u00c2\u00cd\5\26\f\2\u00c3\u00cd\5\30\r\2\u00c4\u00cd\5\32\16\2"+
		"\u00c5\u00cd\5\34\17\2\u00c6\u00cd\5\36\20\2\u00c7\u00cd\5 \21\2\u00c8"+
		"\u00cd\5\"\22\2\u00c9\u00cd\5$\23\2\u00ca\u00cd\5&\24\2\u00cb\u00cd\5"+
		"(\25\2\u00cc\u00c0\3\2\2\2\u00cc\u00c1\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc"+
		"\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\5z>\2"+
		"\u00cf\u00d0\7\6\2\2\u00d0\u00d1\5\64\33\2\u00d1\u00d2\7\5\2\2\u00d2\23"+
		"\3\2\2\2\u00d3\u00d4\5z>\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5\64\33\2\u00d6"+
		"\u00d7\7\5\2\2\u00d7\25\3\2\2\2\u00d8\u00d9\5z>\2\u00d9\u00da\7\b\2\2"+
		"\u00da\u00db\5\64\33\2\u00db\u00dc\7\5\2\2\u00dc\27\3\2\2\2\u00dd\u00de"+
		"\5z>\2\u00de\u00df\7\t\2\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\7\5\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e3\5z>\2\u00e3\u00e4\7\n\2\2\u00e4\u00e5\5\64\33"+
		"\2\u00e5\u00e6\7\5\2\2\u00e6\33\3\2\2\2\u00e7\u00e8\5z>\2\u00e8\u00e9"+
		"\7\13\2\2\u00e9\u00ea\5\64\33\2\u00ea\u00eb\7\5\2\2\u00eb\35\3\2\2\2\u00ec"+
		"\u00ed\5z>\2\u00ed\u00ee\7\f\2\2\u00ee\u00ef\5\64\33\2\u00ef\u00f0\7\5"+
		"\2\2\u00f0\37\3\2\2\2\u00f1\u00f2\5z>\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4"+
		"\5\64\33\2\u00f4\u00f5\7\5\2\2\u00f5!\3\2\2\2\u00f6\u00f7\5z>\2\u00f7"+
		"\u00f8\7\r\2\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7\5\2\2\u00fa#\3\2\2"+
		"\2\u00fb\u00fc\5z>\2\u00fc\u00fd\7\16\2\2\u00fd\u00fe\5\64\33\2\u00fe"+
		"\u00ff\7\5\2\2\u00ff%\3\2\2\2\u0100\u0101\5z>\2\u0101\u0102\7\17\2\2\u0102"+
		"\u0103\5\64\33\2\u0103\u0104\7\5\2\2\u0104\'\3\2\2\2\u0105\u0106\5z>\2"+
		"\u0106\u0107\7\20\2\2\u0107\u0108\5\64\33\2\u0108\u0109\7\5\2\2\u0109"+
		")\3\2\2\2\u010a\u010b\7/\2\2\u010b\u010c\7\21\2\2\u010c\u010d\5\64\33"+
		"\2\u010d\u010e\7\22\2\2\u010e\u010f\5\4\3\2\u010f+\3\2\2\2\u0110\u0111"+
		"\7\60\2\2\u0111\u0112\7/\2\2\u0112\u0113\7\21\2\2\u0113\u0114\5\64\33"+
		"\2\u0114\u0115\7\22\2\2\u0115\u0116\5\4\3\2\u0116-\3\2\2\2\u0117\u0118"+
		"\7\60\2\2\u0118\u0119\5\4\3\2\u0119/\3\2\2\2\u011a\u011b\5x=\2\u011b\u011c"+
		"\5z>\2\u011c\u0129\7\21\2\2\u011d\u011e\5x=\2\u011e\u011f\5z>\2\u011f"+
		"\u0120\7\23\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0122\u0125\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\5x=\2\u0127\u0128\5z>\2\u0128\u012a\3\2\2\2"+
		"\u0129\u0123\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\7\22\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5\4\3\2\u012e\61\3\2\2\2\u012f"+
		"\u0130\7\61\2\2\u0130\u0131\5\64\33\2\u0131\u0132\7\5\2\2\u0132\63\3\2"+
		"\2\2\u0133\u0134\7\21\2\2\u0134\u0135\5\64\33\2\u0135\u0136\7\22\2\2\u0136"+
		"\u013a\3\2\2\2\u0137\u013a\5\66\34\2\u0138\u013a\58\35\2\u0139\u0133\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\65\3\2\2\2\u013b"+
		"\u0141\5|?\2\u013c\u0141\5~@\2\u013d\u0141\5\u0080A\2\u013e\u0141\5\u0082"+
		"B\2\u013f\u0141\5z>\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u013d"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\67\3\2\2\2\u0142"+
		"\u0143\5:\36\2\u01439\3\2\2\2\u0144\u0147\5f\64\2\u0145\u0147\5<\37\2"+
		"\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u015b\3\2\2\2\u0148\u0158"+
		"\7\21\2\2\u0149\u014c\5f\64\2\u014a\u014c\5<\37\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\23\2\2\u014e\u0150"+
		"\3\2\2\2\u014f\u014b\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0157\5f"+
		"\64\2\u0155\u0157\5<\37\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\7\22\2\2\u015b\u0148\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		";\3\2\2\2\u015d\u0160\5f\64\2\u015e\u0160\5> \2\u015f\u015d\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0166\3\2\2\2\u0161\u0164\7\24\2\2\u0162\u0165\5"+
		"f\64\2\u0163\u0165\5> \2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0167\3\2\2\2\u0167=\3\2\2\2"+
		"\u0168\u016b\5f\64\2\u0169\u016b\5@!\2\u016a\u0168\3\2\2\2\u016a\u0169"+
		"\3\2\2\2\u016b\u0171\3\2\2\2\u016c\u016f\7\25\2\2\u016d\u0170\5f\64\2"+
		"\u016e\u0170\5@!\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u0172\3\2\2\2\u0172?\3\2\2\2\u0173"+
		"\u0176\5f\64\2\u0174\u0176\5B\"\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2"+
		"\2\2\u0176\u017c\3\2\2\2\u0177\u017a\7\26\2\2\u0178\u017b\5f\64\2\u0179"+
		"\u017b\5B\"\2\u017a\u0178\3\2\2\2\u017a\u0179\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u0177\3\2\2\2\u017c\u017d\3\2\2\2\u017dA\3\2\2\2\u017e\u0181"+
		"\5f\64\2\u017f\u0181\5D#\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0189\3\2\2\2\u0182\u0185\7\27\2\2\u0183\u0186\5f\64\2\u0184\u0186\5"+
		"D#\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0188\3\2\2\2\u0187"+
		"\u0182\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018aC\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018f\5f\64\2\u018d\u018f"+
		"\5F$\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0197\3\2\2\2\u0190"+
		"\u0193\7\30\2\2\u0191\u0194\5f\64\2\u0192\u0194\5F$\2\u0193\u0191\3\2"+
		"\2\2\u0193\u0192\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0190\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198E\3\2\2\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\5f\64\2\u019b\u019d\5H%\2\u019c\u019a"+
		"\3\2\2\2\u019c\u019b\3\2\2\2\u019d\u01a3\3\2\2\2\u019e\u01a1\7\31\2\2"+
		"\u019f\u01a2\5f\64\2\u01a0\u01a2\5H%\2\u01a1\u019f\3\2\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"G\3\2\2\2\u01a5\u01a8\5f\64\2\u01a6\u01a8\5J&\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a8\u01ae\3\2\2\2\u01a9\u01ac\7\32\2\2\u01aa\u01ad\5"+
		"f\64\2\u01ab\u01ad\5J&\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01af\3\2\2\2\u01afI\3\2\2\2"+
		"\u01b0\u01b3\5f\64\2\u01b1\u01b3\5L\'\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b9\3\2\2\2\u01b4\u01b7\7\33\2\2\u01b5\u01b8\5f\64\2"+
		"\u01b6\u01b8\5L\'\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baK\3\2\2\2\u01bb"+
		"\u01be\5f\64\2\u01bc\u01be\5N(\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2"+
		"\2\u01be\u01c4\3\2\2\2\u01bf\u01c2\7\34\2\2\u01c0\u01c3\5f\64\2\u01c1"+
		"\u01c3\5N(\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c5\3\2\2"+
		"\2\u01c4\u01bf\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5M\3\2\2\2\u01c6\u01c9"+
		"\5f\64\2\u01c7\u01c9\5P)\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01cf\3\2\2\2\u01ca\u01cd\7\35\2\2\u01cb\u01ce\5f\64\2\u01cc\u01ce\5"+
		"P)\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01ca\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0O\3\2\2\2\u01d1\u01d4\5f\64\2"+
		"\u01d2\u01d4\5R*\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01da"+
		"\3\2\2\2\u01d5\u01d8\7\36\2\2\u01d6\u01d9\5f\64\2\u01d7\u01d9\5R*\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d5\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01dbQ\3\2\2\2\u01dc\u01df\5f\64\2\u01dd\u01df"+
		"\5T+\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e5\3\2\2\2\u01e0"+
		"\u01e3\7\37\2\2\u01e1\u01e4\5f\64\2\u01e2\u01e4\5T+\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6S\3\2\2\2\u01e7\u01ea\5f\64\2\u01e8\u01ea\5V,\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01f0\3\2\2\2\u01eb\u01ee\7 "+
		"\2\2\u01ec\u01ef\5f\64\2\u01ed\u01ef\5V,\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed"+
		"\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"U\3\2\2\2\u01f2\u01f5\5f\64\2\u01f3\u01f5\5X-\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5\u01fd\3\2\2\2\u01f6\u01f9\7!\2\2\u01f7\u01fa\5f\64"+
		"\2\u01f8\u01fa\5X-\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fc"+
		"\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01feW\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0203\5f\64\2"+
		"\u0201\u0203\5Z.\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u020b"+
		"\3\2\2\2\u0204\u0207\7\"\2\2\u0205\u0208\5f\64\2\u0206\u0208\5Z.\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\u020a\3\2\2\2\u0209\u0204\3\2"+
		"\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"Y\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0211\5d\63\2\u020f\u0211\5\\/\2\u0210"+
		"\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211\u0217\3\2\2\2\u0212\u0215\7#"+
		"\2\2\u0213\u0216\5d\63\2\u0214\u0216\5\\/\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0214\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0212\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218[\3\2\2\2\u0219\u021c\5d\63\2\u021a\u021c\5^\60\2\u021b\u0219"+
		"\3\2\2\2\u021b\u021a\3\2\2\2\u021c\u0224\3\2\2\2\u021d\u0220\7$\2\2\u021e"+
		"\u0221\5d\63\2\u021f\u0221\5^\60\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u021d\3\2\2\2\u0223\u0226\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225]\3\2\2\2\u0226\u0224\3\2\2\2"+
		"\u0227\u022a\5d\63\2\u0228\u022a\5`\61\2\u0229\u0227\3\2\2\2\u0229\u0228"+
		"\3\2\2\2\u022a\u0232\3\2\2\2\u022b\u022e\7%\2\2\u022c\u022f\5d\63\2\u022d"+
		"\u022f\5`\61\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0231\3\2"+
		"\2\2\u0230\u022b\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233_\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0238\5d\63\2"+
		"\u0236\u0238\5b\62\2\u0237\u0235\3\2\2\2\u0237\u0236\3\2\2\2\u0238\u023e"+
		"\3\2\2\2\u0239\u023c\7&\2\2\u023a\u023d\5d\63\2\u023b\u023d\5b\62\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023b\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0239\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023fa\3\2\2\2\u0240\u0245\5d\63\2\u0241\u0242"+
		"\7\'\2\2\u0242\u0243\5d\63\2\u0243\u0244\7(\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0241\3\2\2\2\u0245\u0246\3\2\2\2\u0246c\3\2\2\2\u0247\u024e\5h\65\2"+
		"\u0248\u0249\7\21\2\2\u0249\u024a\5\64\33\2\u024a\u024b\7\22\2\2\u024b"+
		"\u024e\3\2\2\2\u024c\u024e\5\66\34\2\u024d\u0247\3\2\2\2\u024d\u0248\3"+
		"\2\2\2\u024d\u024c\3\2\2\2\u024ee\3\2\2\2\u024f\u0250\7\21\2\2\u0250\u0251"+
		"\5\64\33\2\u0251\u0252\7\22\2\2\u0252\u0255\3\2\2\2\u0253\u0255\5\66\34"+
		"\2\u0254\u024f\3\2\2\2\u0254\u0253\3\2\2\2\u0255g\3\2\2\2\u0256\u025e"+
		"\5j\66\2\u0257\u025e\5l\67\2\u0258\u025e\5n8\2\u0259\u025e\5p9\2\u025a"+
		"\u025e\5r:\2\u025b\u025e\5t;\2\u025c\u025e\5v<\2\u025d\u0256\3\2\2\2\u025d"+
		"\u0257\3\2\2\2\u025d\u0258\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025a\3\2"+
		"\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025ei\3\2\2\2\u025f\u0260"+
		"\7\21\2\2\u0260\u0261\5\64\33\2\u0261\u0262\7\22\2\2\u0262\u0265\3\2\2"+
		"\2\u0263\u0265\5\66\34\2\u0264\u025f\3\2\2\2\u0264\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\7)\2\2\u0267k\3\2\2\2\u0268\u0269\7\21\2\2"+
		"\u0269\u026a\5\64\33\2\u026a\u026b\7\22\2\2\u026b\u026e\3\2\2\2\u026c"+
		"\u026e\5\66\34\2\u026d\u0268\3\2\2\2\u026d\u026c\3\2\2\2\u026e\u026f\3"+
		"\2\2\2\u026f\u0270\7*\2\2\u0270m\3\2\2\2\u0271\u0277\7)\2\2\u0272\u0273"+
		"\7\21\2\2\u0273\u0274\5\64\33\2\u0274\u0275\7\22\2\2\u0275\u0278\3\2\2"+
		"\2\u0276\u0278\5\66\34\2\u0277\u0272\3\2\2\2\u0277\u0276\3\2\2\2\u0278"+
		"o\3\2\2\2\u0279\u027f\7*\2\2\u027a\u027b\7\21\2\2\u027b\u027c\5\64\33"+
		"\2\u027c\u027d\7\22\2\2\u027d\u0280\3\2\2\2\u027e\u0280\5\66\34\2\u027f"+
		"\u027a\3\2\2\2\u027f\u027e\3\2\2\2\u0280q\3\2\2\2\u0281\u0287\7!\2\2\u0282"+
		"\u0283\7\21\2\2\u0283\u0284\5\64\33\2\u0284\u0285\7\22\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0288\5\66\34\2\u0287\u0282\3\2\2\2\u0287\u0286\3\2\2\2"+
		"\u0288s\3\2\2\2\u0289\u028f\7+\2\2\u028a\u028b\7\21\2\2\u028b\u028c\5"+
		"\64\33\2\u028c\u028d\7\22\2\2\u028d\u0290\3\2\2\2\u028e\u0290\5\66\34"+
		"\2\u028f\u028a\3\2\2\2\u028f\u028e\3\2\2\2\u0290u\3\2\2\2\u0291\u0297"+
		"\7,\2\2\u0292\u0293\7\21\2\2\u0293\u0294\5\64\33\2\u0294\u0295\7\22\2"+
		"\2\u0295\u0298\3\2\2\2\u0296\u0298\5\66\34\2\u0297\u0292\3\2\2\2\u0297"+
		"\u0296\3\2\2\2\u0298w\3\2\2\2\u0299\u029b\7\62\2\2\u029a\u029c\7-\2\2"+
		"\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029cy\3\2\2\2\u029d\u029e\7"+
		"\63\2\2\u029e{\3\2\2\2\u029f\u02a0\7\64\2\2\u02a0}\3\2\2\2\u02a1\u02a2"+
		"\7\65\2\2\u02a2\177\3\2\2\2\u02a3\u02a4\7\66\2\2\u02a4\u0081\3\2\2\2\u02a5"+
		"\u02af\7\'\2\2\u02a6\u02a7\5\64\33\2\u02a7\u02a8\7\23\2\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b0\5\64"+
		"\33\2\u02af\u02ab\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b2\7(\2\2\u02b2\u0083\3\2\2\2Z\u0087\u0094\u0098\u009e\u00a4\u00ae"+
		"\u00cc\u0123\u0129\u0139\u0140\u0146\u014b\u0151\u0156\u0158\u015b\u015f"+
		"\u0164\u0166\u016a\u016f\u0171\u0175\u017a\u017c\u0180\u0185\u0189\u018e"+
		"\u0193\u0197\u019c\u01a1\u01a3\u01a7\u01ac\u01ae\u01b2\u01b7\u01b9\u01bd"+
		"\u01c2\u01c4\u01c8\u01cd\u01cf\u01d3\u01d8\u01da\u01de\u01e3\u01e5\u01e9"+
		"\u01ee\u01f0\u01f4\u01f9\u01fd\u0202\u0207\u020b\u0210\u0215\u0217\u021b"+
		"\u0220\u0224\u0229\u022e\u0232\u0237\u023c\u023e\u0245\u024d\u0254\u025d"+
		"\u0264\u026d\u0277\u027f\u0287\u028f\u0297\u029b\u02ab\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}