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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, NATIVE=45, 
		IF=46, ELSE=47, FOR=48, WHILE=49, RETURN=50, TYPE=51, VARIABLE=52, NUMBER=53, 
		STRING=54, CHARACTER=55, WHITESPACE=56;
	public static final int
		RULE_root = 0, RULE_element = 1, RULE_basic_element = 2, RULE_block_element = 3, 
		RULE_block = 4, RULE_native_block = 5, RULE_declaration = 6, RULE_instantiation = 7, 
		RULE_discarded_statement = 8, RULE_assignment = 9, RULE_direct_assign = 10, 
		RULE_sum_assign = 11, RULE_difference_assign = 12, RULE_product_assign = 13, 
		RULE_quotient_assign = 14, RULE_modulus_assign = 15, RULE_power_assign = 16, 
		RULE_bit_left_assign = 17, RULE_bit_right_assign = 18, RULE_bit_and_assign = 19, 
		RULE_bit_xor_assign = 20, RULE_bit_or_assign = 21, RULE_if_statement = 22, 
		RULE_else_if_statement = 23, RULE_else_statement = 24, RULE_for_loop = 25, 
		RULE_while_loop = 26, RULE_function = 27, RULE_return_statement = 28, 
		RULE_expression = 29, RULE_postfix_call_subscript = 30, RULE_prefix_unary = 31, 
		RULE_pow_root = 32, RULE_mult_div_mod = 33, RULE_add_sub = 34, RULE_bitleft_right = 35, 
		RULE_less_greater = 36, RULE_equal_notequal = 37, RULE_bitand = 38, RULE_bitxor = 39, 
		RULE_bitor = 40, RULE_and = 41, RULE_or = 42, RULE_type = 43, RULE_variable = 44, 
		RULE_number = 45, RULE_string = 46, RULE_character = 47, RULE_array = 48;
	public static final String[] ruleNames = {
		"root", "element", "basic_element", "block_element", "block", "native_block", 
		"declaration", "instantiation", "discarded_statement", "assignment", "direct_assign", 
		"sum_assign", "difference_assign", "product_assign", "quotient_assign", 
		"modulus_assign", "power_assign", "bit_left_assign", "bit_right_assign", 
		"bit_and_assign", "bit_xor_assign", "bit_or_assign", "if_statement", "else_if_statement", 
		"else_statement", "for_loop", "while_loop", "function", "return_statement", 
		"expression", "postfix_call_subscript", "prefix_unary", "pow_root", "mult_div_mod", 
		"add_sub", "bitleft_right", "less_greater", "equal_notequal", "bitand", 
		"bitxor", "bitor", "and", "or", "type", "variable", "number", "string", 
		"character", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'**='", "'<<='", "'&='", "'^='", "'|='", "'('", "')'", "','", "'++'", 
		"'--'", "'['", "']'", "'+'", "'-'", "'!'", "'~'", "'**'", "'//'", "'*'", 
		"'/'", "'%'", "'<<'", "'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'&'", "'^'", "'|'", "'&&'", "'||'", "'[]'", "'native'", "'if'", "'else'", 
		"'for'", "'while'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "NATIVE", "IF", 
		"ELSE", "FOR", "WHILE", "RETURN", "TYPE", "VARIABLE", "NUMBER", "STRING", 
		"CHARACTER", "WHITESPACE"
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
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NATIVE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << TYPE) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(98);
				element();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
		public Basic_elementContext basic_element() {
			return getRuleContext(Basic_elementContext.class,0);
		}
		public Block_elementContext block_element() {
			return getRuleContext(Block_elementContext.class,0);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				basic_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				block_element();
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

	public static class Basic_elementContext extends ParserRuleContext {
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Basic_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBasic_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBasic_element(this);
		}
	}

	public final Basic_elementContext basic_element() throws RecognitionException {
		Basic_elementContext _localctx = new Basic_elementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basic_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(110);
				declaration();
				}
				break;
			case 2:
				{
				setState(111);
				instantiation();
				}
				break;
			case 3:
				{
				setState(112);
				assignment();
				}
				break;
			case 4:
				{
				setState(113);
				discarded_statement();
				}
				break;
			case 5:
				{
				setState(114);
				return_statement();
				}
				break;
			}
			setState(117);
			match(T__0);
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

	public static class Block_elementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_if_statementContext else_if_statement() {
			return getRuleContext(Else_if_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Native_blockContext native_block() {
			return getRuleContext(Native_blockContext.class,0);
		}
		public Block_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBlock_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBlock_element(this);
		}
	}

	public final Block_elementContext block_element() throws RecognitionException {
		Block_elementContext _localctx = new Block_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block_element);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				else_if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
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
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__1);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NATIVE) | (1L << IF) | (1L << ELSE) | (1L << RETURN) | (1L << TYPE) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				{
				setState(128);
				element();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		enterRule(_localctx, 10, RULE_native_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(NATIVE);
			setState(137);
			match(T__1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(138);
					matchWildcard();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(144);
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			type();
			setState(147);
			variable();
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
		enterRule(_localctx, 14, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			type();
			setState(150);
			variable();
			setState(151);
			match(T__3);
			setState(152);
			expression(0);
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
		enterRule(_localctx, 16, RULE_discarded_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			expression(0);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				direct_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				sum_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				difference_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				product_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				quotient_assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				modulus_assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				power_assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				bit_left_assign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				bit_right_assign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				bit_and_assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(166);
				bit_xor_assign();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(167);
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
		enterRule(_localctx, 20, RULE_direct_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			variable();
			setState(171);
			match(T__3);
			setState(172);
			expression(0);
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
		enterRule(_localctx, 22, RULE_sum_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			variable();
			setState(175);
			match(T__4);
			setState(176);
			expression(0);
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
		enterRule(_localctx, 24, RULE_difference_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			variable();
			setState(179);
			match(T__5);
			setState(180);
			expression(0);
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
		enterRule(_localctx, 26, RULE_product_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			variable();
			setState(183);
			match(T__6);
			setState(184);
			expression(0);
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
		enterRule(_localctx, 28, RULE_quotient_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			variable();
			setState(187);
			match(T__7);
			setState(188);
			expression(0);
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
		enterRule(_localctx, 30, RULE_modulus_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			variable();
			setState(191);
			match(T__8);
			setState(192);
			expression(0);
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
		enterRule(_localctx, 32, RULE_power_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			variable();
			setState(195);
			match(T__9);
			setState(196);
			expression(0);
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
		enterRule(_localctx, 34, RULE_bit_left_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			variable();
			setState(199);
			match(T__10);
			setState(200);
			expression(0);
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
		enterRule(_localctx, 36, RULE_bit_right_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			variable();
			setState(203);
			match(T__10);
			setState(204);
			expression(0);
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
		enterRule(_localctx, 38, RULE_bit_and_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			variable();
			setState(207);
			match(T__11);
			setState(208);
			expression(0);
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
		enterRule(_localctx, 40, RULE_bit_xor_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			variable();
			setState(211);
			match(T__12);
			setState(212);
			expression(0);
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
		enterRule(_localctx, 42, RULE_bit_or_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			variable();
			setState(215);
			match(T__13);
			setState(216);
			expression(0);
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
		enterRule(_localctx, 44, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IF);
			setState(219);
			match(T__14);
			setState(220);
			expression(0);
			setState(221);
			match(T__15);
			setState(222);
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
		enterRule(_localctx, 46, RULE_else_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ELSE);
			setState(225);
			match(IF);
			setState(226);
			match(T__14);
			setState(227);
			expression(0);
			setState(228);
			match(T__15);
			setState(229);
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
		enterRule(_localctx, 48, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ELSE);
			setState(232);
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

	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CompilerParser.FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(FOR);
			setState(235);
			match(T__14);
			setState(236);
			expression(0);
			setState(237);
			match(T__15);
			setState(238);
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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(WHILE);
			setState(241);
			match(T__14);
			setState(242);
			expression(0);
			setState(243);
			match(T__15);
			setState(244);
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
		enterRule(_localctx, 54, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			type();
			setState(247);
			variable();
			{
			setState(248);
			match(T__14);
			setState(261);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						type();
						setState(250);
						variable();
						setState(251);
						match(T__16);
						}
						} 
					}
					setState(257);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(258);
				type();
				setState(259);
				variable();
				}
			}

			setState(263);
			match(T__15);
			}
			setState(265);
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
		enterRule(_localctx, 56, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(RETURN);
			setState(268);
			expression(0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		public Prefix_unaryContext prefix_unary() {
			return getRuleContext(Prefix_unaryContext.class,0);
		}
		public Pow_rootContext pow_root() {
			return getRuleContext(Pow_rootContext.class,0);
		}
		public Mult_div_modContext mult_div_mod() {
			return getRuleContext(Mult_div_modContext.class,0);
		}
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public Bitleft_rightContext bitleft_right() {
			return getRuleContext(Bitleft_rightContext.class,0);
		}
		public Less_greaterContext less_greater() {
			return getRuleContext(Less_greaterContext.class,0);
		}
		public Equal_notequalContext equal_notequal() {
			return getRuleContext(Equal_notequalContext.class,0);
		}
		public BitandContext bitand() {
			return getRuleContext(BitandContext.class,0);
		}
		public BitxorContext bitxor() {
			return getRuleContext(BitxorContext.class,0);
		}
		public BitorContext bitor() {
			return getRuleContext(BitorContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public Postfix_call_subscriptContext postfix_call_subscript() {
			return getRuleContext(Postfix_call_subscriptContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(271);
				match(T__14);
				setState(272);
				expression(0);
				setState(273);
				match(T__15);
				}
				break;
			case NUMBER:
				{
				setState(275);
				number();
				}
				break;
			case STRING:
				{
				setState(276);
				string();
				}
				break;
			case CHARACTER:
				{
				setState(277);
				character();
				}
				break;
			case T__19:
				{
				setState(278);
				array();
				}
				break;
			case VARIABLE:
				{
				setState(279);
				variable();
				}
				break;
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				{
				setState(280);
				prefix_unary();
				setState(281);
				expression(12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(286);
						pow_root();
						setState(287);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290);
						mult_div_mod();
						setState(291);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						add_sub();
						setState(295);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(298);
						bitleft_right();
						setState(299);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						less_greater();
						setState(303);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(306);
						equal_notequal();
						setState(307);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(310);
						bitand();
						setState(311);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(314);
						bitxor();
						setState(315);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						bitor();
						setState(319);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						and();
						setState(323);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(326);
						or();
						setState(327);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(330);
						postfix_call_subscript();
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Postfix_call_subscriptContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Postfix_call_subscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_call_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPostfix_call_subscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPostfix_call_subscript(this);
		}
	}

	public final Postfix_call_subscriptContext postfix_call_subscript() throws RecognitionException {
		Postfix_call_subscriptContext _localctx = new Postfix_call_subscriptContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_postfix_call_subscript);
		int _la;
		try {
			int _alt;
			setState(355);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__18);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__14);
				setState(348);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
					{
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(339);
							expression(0);
							setState(340);
							match(T__16);
							}
							} 
						}
						setState(346);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(347);
					expression(0);
					}
				}

				setState(350);
				match(T__15);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(T__19);
				setState(352);
				expression(0);
				setState(353);
				match(T__20);
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

	public static class Prefix_unaryContext extends ParserRuleContext {
		public Prefix_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPrefix_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPrefix_unary(this);
		}
	}

	public final Prefix_unaryContext prefix_unary() throws RecognitionException {
		Prefix_unaryContext _localctx = new Prefix_unaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_prefix_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Pow_rootContext extends ParserRuleContext {
		public Pow_rootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPow_root(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPow_root(this);
		}
	}

	public final Pow_rootContext pow_root() throws RecognitionException {
		Pow_rootContext _localctx = new Pow_rootContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pow_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Mult_div_modContext extends ParserRuleContext {
		public Mult_div_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_div_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterMult_div_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitMult_div_mod(this);
		}
	}

	public final Mult_div_modContext mult_div_mod() throws RecognitionException {
		Mult_div_modContext _localctx = new Mult_div_modContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mult_div_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Add_subContext extends ParserRuleContext {
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		Add_subContext _localctx = new Add_subContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Bitleft_rightContext extends ParserRuleContext {
		public Bitleft_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitleft_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitleft_right(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitleft_right(this);
		}
	}

	public final Bitleft_rightContext bitleft_right() throws RecognitionException {
		Bitleft_rightContext _localctx = new Bitleft_rightContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bitleft_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Less_greaterContext extends ParserRuleContext {
		public Less_greaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterLess_greater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitLess_greater(this);
		}
	}

	public final Less_greaterContext less_greater() throws RecognitionException {
		Less_greaterContext _localctx = new Less_greaterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_less_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Equal_notequalContext extends ParserRuleContext {
		public Equal_notequalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_notequal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterEqual_notequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitEqual_notequal(this);
		}
	}

	public final Equal_notequalContext equal_notequal() throws RecognitionException {
		Equal_notequalContext _localctx = new Equal_notequalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equal_notequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==T__36 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class BitandContext extends ParserRuleContext {
		public BitandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitand(this);
		}
	}

	public final BitandContext bitand() throws RecognitionException {
		BitandContext _localctx = new BitandContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bitand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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

	public static class BitxorContext extends ParserRuleContext {
		public BitxorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitxor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitxor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitxor(this);
		}
	}

	public final BitxorContext bitxor() throws RecognitionException {
		BitxorContext _localctx = new BitxorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bitxor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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

	public static class BitorContext extends ParserRuleContext {
		public BitorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBitor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBitor(this);
		}
	}

	public final BitorContext bitor() throws RecognitionException {
		BitorContext _localctx = new BitorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__40);
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
		enterRule(_localctx, 82, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__41);
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
		enterRule(_localctx, 84, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__42);
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
		enterRule(_localctx, 86, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(TYPE);
			setState(383);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(382);
				match(T__43);
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
		enterRule(_localctx, 88, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
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
		enterRule(_localctx, 90, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 92, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 94, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 96, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__19);
			setState(403);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER))) != 0)) {
				{
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						expression(0);
						setState(395);
						match(T__16);
						}
						} 
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(402);
				expression(0);
				}
			}

			setState(405);
			match(T__20);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		case 11:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\3\2\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\7\6\u0084\n\6\f\6\16"+
		"\6\u0087\13\6\3\6\3\6\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0100\n\35\f\35\16\35\u0103"+
		"\13\35\3\35\3\35\3\35\5\35\u0108\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u011e\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u014e\n\37\f\37\16\37\u0151\13"+
		"\37\3 \3 \3 \3 \3 \3 \7 \u0159\n \f \16 \u015c\13 \3 \5 \u015f\n \3 \3"+
		" \3 \3 \3 \5 \u0166\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\5-\u0182\n-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u0190\n\62\f\62\16\62\u0193\13\62\3"+
		"\62\5\62\u0196\n\62\3\62\3\62\3\62\3\u008f\3<\63\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\t\4\2"+
		"\24\25\30\33\3\2\34\35\3\2\36 \3\2\30\31\3\2!\"\3\2#&\3\2\'(\u019c\2g"+
		"\3\2\2\2\4n\3\2\2\2\6u\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u008a\3"+
		"\2\2\2\16\u0094\3\2\2\2\20\u0097\3\2\2\2\22\u009c\3\2\2\2\24\u00aa\3\2"+
		"\2\2\26\u00ac\3\2\2\2\30\u00b0\3\2\2\2\32\u00b4\3\2\2\2\34\u00b8\3\2\2"+
		"\2\36\u00bc\3\2\2\2 \u00c0\3\2\2\2\"\u00c4\3\2\2\2$\u00c8\3\2\2\2&\u00cc"+
		"\3\2\2\2(\u00d0\3\2\2\2*\u00d4\3\2\2\2,\u00d8\3\2\2\2.\u00dc\3\2\2\2\60"+
		"\u00e2\3\2\2\2\62\u00e9\3\2\2\2\64\u00ec\3\2\2\2\66\u00f2\3\2\2\28\u00f8"+
		"\3\2\2\2:\u010d\3\2\2\2<\u011d\3\2\2\2>\u0165\3\2\2\2@\u0167\3\2\2\2B"+
		"\u0169\3\2\2\2D\u016b\3\2\2\2F\u016d\3\2\2\2H\u016f\3\2\2\2J\u0171\3\2"+
		"\2\2L\u0173\3\2\2\2N\u0175\3\2\2\2P\u0177\3\2\2\2R\u0179\3\2\2\2T\u017b"+
		"\3\2\2\2V\u017d\3\2\2\2X\u017f\3\2\2\2Z\u0183\3\2\2\2\\\u0185\3\2\2\2"+
		"^\u0187\3\2\2\2`\u0189\3\2\2\2b\u018b\3\2\2\2df\5\4\3\2ed\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3k\3\3\2\2\2lo"+
		"\5\6\4\2mo\5\b\5\2nl\3\2\2\2nm\3\2\2\2o\5\3\2\2\2pv\5\16\b\2qv\5\20\t"+
		"\2rv\5\24\13\2sv\5\22\n\2tv\5:\36\2up\3\2\2\2uq\3\2\2\2ur\3\2\2\2us\3"+
		"\2\2\2ut\3\2\2\2vw\3\2\2\2wx\7\3\2\2x\7\3\2\2\2y\u0080\5.\30\2z\u0080"+
		"\5\60\31\2{\u0080\5\62\32\2|\u0080\58\35\2}\u0080\5\n\6\2~\u0080\5\f\7"+
		"\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\t\3\2\2\2\u0081\u0085\7\4\2\2\u0082\u0084\5\4\3\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\5\2\2\u0089"+
		"\13\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008f\7\4\2\2\u008c\u008e\13\2\2"+
		"\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u0090\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\5\2\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\5X-\2\u0095\u0096\5Z.\2\u0096\17\3\2\2\2\u0097"+
		"\u0098\5X-\2\u0098\u0099\5Z.\2\u0099\u009a\7\6\2\2\u009a\u009b\5<\37\2"+
		"\u009b\21\3\2\2\2\u009c\u009d\5<\37\2\u009d\23\3\2\2\2\u009e\u00ab\5\26"+
		"\f\2\u009f\u00ab\5\30\r\2\u00a0\u00ab\5\32\16\2\u00a1\u00ab\5\34\17\2"+
		"\u00a2\u00ab\5\36\20\2\u00a3\u00ab\5 \21\2\u00a4\u00ab\5\"\22\2\u00a5"+
		"\u00ab\5$\23\2\u00a6\u00ab\5&\24\2\u00a7\u00ab\5(\25\2\u00a8\u00ab\5*"+
		"\26\2\u00a9\u00ab\5,\27\2\u00aa\u009e\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2"+
		"\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2"+
		"\2\u00ac\u00ad\5Z.\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\5<\37\2\u00af\27"+
		"\3\2\2\2\u00b0\u00b1\5Z.\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5<\37\2\u00b3"+
		"\31\3\2\2\2\u00b4\u00b5\5Z.\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\5<\37\2"+
		"\u00b7\33\3\2\2\2\u00b8\u00b9\5Z.\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb\5"+
		"<\37\2\u00bb\35\3\2\2\2\u00bc\u00bd\5Z.\2\u00bd\u00be\7\n\2\2\u00be\u00bf"+
		"\5<\37\2\u00bf\37\3\2\2\2\u00c0\u00c1\5Z.\2\u00c1\u00c2\7\13\2\2\u00c2"+
		"\u00c3\5<\37\2\u00c3!\3\2\2\2\u00c4\u00c5\5Z.\2\u00c5\u00c6\7\f\2\2\u00c6"+
		"\u00c7\5<\37\2\u00c7#\3\2\2\2\u00c8\u00c9\5Z.\2\u00c9\u00ca\7\r\2\2\u00ca"+
		"\u00cb\5<\37\2\u00cb%\3\2\2\2\u00cc\u00cd\5Z.\2\u00cd\u00ce\7\r\2\2\u00ce"+
		"\u00cf\5<\37\2\u00cf\'\3\2\2\2\u00d0\u00d1\5Z.\2\u00d1\u00d2\7\16\2\2"+
		"\u00d2\u00d3\5<\37\2\u00d3)\3\2\2\2\u00d4\u00d5\5Z.\2\u00d5\u00d6\7\17"+
		"\2\2\u00d6\u00d7\5<\37\2\u00d7+\3\2\2\2\u00d8\u00d9\5Z.\2\u00d9\u00da"+
		"\7\20\2\2\u00da\u00db\5<\37\2\u00db-\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd"+
		"\u00de\7\21\2\2\u00de\u00df\5<\37\2\u00df\u00e0\7\22\2\2\u00e0\u00e1\5"+
		"\4\3\2\u00e1/\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\7\60\2\2\u00e4"+
		"\u00e5\7\21\2\2\u00e5\u00e6\5<\37\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\5"+
		"\4\3\2\u00e8\61\3\2\2\2\u00e9\u00ea\7\61\2\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\63\3\2\2\2\u00ec\u00ed\7\62\2\2\u00ed\u00ee\7\21\2\2\u00ee\u00ef\5<\37"+
		"\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1\5\4\3\2\u00f1\65\3\2\2\2\u00f2\u00f3"+
		"\7\63\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f5\5<\37\2\u00f5\u00f6\7\22\2"+
		"\2\u00f6\u00f7\5\4\3\2\u00f7\67\3\2\2\2\u00f8\u00f9\5X-\2\u00f9\u00fa"+
		"\5Z.\2\u00fa\u0107\7\21\2\2\u00fb\u00fc\5X-\2\u00fc\u00fd\5Z.\2\u00fd"+
		"\u00fe\7\23\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0103\3"+
		"\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\5X-\2\u0105\u0106\5Z.\2\u0106\u0108\3\2\2\2"+
		"\u0107\u0101\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\7\22\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5\4\3\2\u010c9\3\2\2\2\u010d"+
		"\u010e\7\64\2\2\u010e\u010f\5<\37\2\u010f;\3\2\2\2\u0110\u0111\b\37\1"+
		"\2\u0111\u0112\7\21\2\2\u0112\u0113\5<\37\2\u0113\u0114\7\22\2\2\u0114"+
		"\u011e\3\2\2\2\u0115\u011e\5\\/\2\u0116\u011e\5^\60\2\u0117\u011e\5`\61"+
		"\2\u0118\u011e\5b\62\2\u0119\u011e\5Z.\2\u011a\u011b\5@!\2\u011b\u011c"+
		"\5<\37\16\u011c\u011e\3\2\2\2\u011d\u0110\3\2\2\2\u011d\u0115\3\2\2\2"+
		"\u011d\u0116\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119"+
		"\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u014f\3\2\2\2\u011f\u0120\f\r\2\2\u0120"+
		"\u0121\5B\"\2\u0121\u0122\5<\37\16\u0122\u014e\3\2\2\2\u0123\u0124\f\f"+
		"\2\2\u0124\u0125\5D#\2\u0125\u0126\5<\37\r\u0126\u014e\3\2\2\2\u0127\u0128"+
		"\f\13\2\2\u0128\u0129\5F$\2\u0129\u012a\5<\37\f\u012a\u014e\3\2\2\2\u012b"+
		"\u012c\f\n\2\2\u012c\u012d\5H%\2\u012d\u012e\5<\37\13\u012e\u014e\3\2"+
		"\2\2\u012f\u0130\f\t\2\2\u0130\u0131\5J&\2\u0131\u0132\5<\37\n\u0132\u014e"+
		"\3\2\2\2\u0133\u0134\f\b\2\2\u0134\u0135\5L\'\2\u0135\u0136\5<\37\t\u0136"+
		"\u014e\3\2\2\2\u0137\u0138\f\7\2\2\u0138\u0139\5N(\2\u0139\u013a\5<\37"+
		"\b\u013a\u014e\3\2\2\2\u013b\u013c\f\6\2\2\u013c\u013d\5P)\2\u013d\u013e"+
		"\5<\37\7\u013e\u014e\3\2\2\2\u013f\u0140\f\5\2\2\u0140\u0141\5R*\2\u0141"+
		"\u0142\5<\37\6\u0142\u014e\3\2\2\2\u0143\u0144\f\4\2\2\u0144\u0145\5T"+
		"+\2\u0145\u0146\5<\37\5\u0146\u014e\3\2\2\2\u0147\u0148\f\3\2\2\u0148"+
		"\u0149\5V,\2\u0149\u014a\5<\37\4\u014a\u014e\3\2\2\2\u014b\u014c\f\17"+
		"\2\2\u014c\u014e\5> \2\u014d\u011f\3\2\2\2\u014d\u0123\3\2\2\2\u014d\u0127"+
		"\3\2\2\2\u014d\u012b\3\2\2\2\u014d\u012f\3\2\2\2\u014d\u0133\3\2\2\2\u014d"+
		"\u0137\3\2\2\2\u014d\u013b\3\2\2\2\u014d\u013f\3\2\2\2\u014d\u0143\3\2"+
		"\2\2\u014d\u0147\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150=\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0152\u0166\7\24\2\2\u0153\u0166\7\25\2\2\u0154\u015e\7\21\2\2\u0155"+
		"\u0156\5<\37\2\u0156\u0157\7\23\2\2\u0157\u0159\3\2\2\2\u0158\u0155\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\5<\37\2\u015e\u015a\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0166\7\22\2\2\u0161"+
		"\u0162\7\26\2\2\u0162\u0163\5<\37\2\u0163\u0164\7\27\2\2\u0164\u0166\3"+
		"\2\2\2\u0165\u0152\3\2\2\2\u0165\u0153\3\2\2\2\u0165\u0154\3\2\2\2\u0165"+
		"\u0161\3\2\2\2\u0166?\3\2\2\2\u0167\u0168\t\2\2\2\u0168A\3\2\2\2\u0169"+
		"\u016a\t\3\2\2\u016aC\3\2\2\2\u016b\u016c\t\4\2\2\u016cE\3\2\2\2\u016d"+
		"\u016e\t\5\2\2\u016eG\3\2\2\2\u016f\u0170\t\6\2\2\u0170I\3\2\2\2\u0171"+
		"\u0172\t\7\2\2\u0172K\3\2\2\2\u0173\u0174\t\b\2\2\u0174M\3\2\2\2\u0175"+
		"\u0176\7)\2\2\u0176O\3\2\2\2\u0177\u0178\7*\2\2\u0178Q\3\2\2\2\u0179\u017a"+
		"\7+\2\2\u017aS\3\2\2\2\u017b\u017c\7,\2\2\u017cU\3\2\2\2\u017d\u017e\7"+
		"-\2\2\u017eW\3\2\2\2\u017f\u0181\7\65\2\2\u0180\u0182\7.\2\2\u0181\u0180"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182Y\3\2\2\2\u0183\u0184\7\66\2\2\u0184"+
		"[\3\2\2\2\u0185\u0186\7\67\2\2\u0186]\3\2\2\2\u0187\u0188\78\2\2\u0188"+
		"_\3\2\2\2\u0189\u018a\79\2\2\u018aa\3\2\2\2\u018b\u0195\7\26\2\2\u018c"+
		"\u018d\5<\37\2\u018d\u018e\7\23\2\2\u018e\u0190\3\2\2\2\u018f\u018c\3"+
		"\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\5<\37\2\u0195\u0191\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\27\2\2\u0198"+
		"c\3\2\2\2\24gnu\177\u0085\u008f\u00aa\u0101\u0107\u011d\u014d\u014f\u015a"+
		"\u015e\u0165\u0181\u0191\u0195";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}