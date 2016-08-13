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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		RETURN=46, BREAK=47, CONTINUE=48, IF=49, ELSE=50, FOR=51, WHILE=52, DO=53, 
		TYPE=54, NUMBER=55, STRING=56, CHARACTER=57, BOOLEAN=58, VARIABLE=59, 
		WHITESPACE=60;
	public static final int
		RULE_root = 0, RULE_element = 1, RULE_statement = 2, RULE_basic_statement = 3, 
		RULE_flow_statement = 4, RULE_block_element = 5, RULE_block = 6, RULE_declaration = 7, 
		RULE_instantiation = 8, RULE_assignment = 9, RULE_discarded_statement = 10, 
		RULE_return_statement = 11, RULE_break_statement = 12, RULE_continue_statement = 13, 
		RULE_direct_assign = 14, RULE_sum_assign = 15, RULE_difference_assign = 16, 
		RULE_product_assign = 17, RULE_quotient_assign = 18, RULE_modulus_assign = 19, 
		RULE_power_assign = 20, RULE_bit_left_assign = 21, RULE_bit_right_assign = 22, 
		RULE_bit_and_assign = 23, RULE_bit_xor_assign = 24, RULE_bit_or_assign = 25, 
		RULE_if_statement = 26, RULE_else_if_statement = 27, RULE_else_statement = 28, 
		RULE_for_loop = 29, RULE_while_loop = 30, RULE_do_while_loop = 31, RULE_initialization = 32, 
		RULE_condition = 33, RULE_update = 34, RULE_function = 35, RULE_expression = 36, 
		RULE_postfix_call_subscript = 37, RULE_prefix_unary = 38, RULE_cast = 39, 
		RULE_pow_root = 40, RULE_mult_div_mod = 41, RULE_add_sub = 42, RULE_bitleft_right = 43, 
		RULE_less_greater = 44, RULE_equal_notequal = 45, RULE_bitand = 46, RULE_bitxor = 47, 
		RULE_bitor = 48, RULE_and = 49, RULE_or = 50, RULE_type = 51, RULE_variable = 52, 
		RULE_number = 53, RULE_string = 54, RULE_character = 55, RULE_bool = 56, 
		RULE_array = 57;
	public static final String[] ruleNames = {
		"root", "element", "statement", "basic_statement", "flow_statement", "block_element", 
		"block", "declaration", "instantiation", "assignment", "discarded_statement", 
		"return_statement", "break_statement", "continue_statement", "direct_assign", 
		"sum_assign", "difference_assign", "product_assign", "quotient_assign", 
		"modulus_assign", "power_assign", "bit_left_assign", "bit_right_assign", 
		"bit_and_assign", "bit_xor_assign", "bit_or_assign", "if_statement", "else_if_statement", 
		"else_statement", "for_loop", "while_loop", "do_while_loop", "initialization", 
		"condition", "update", "function", "expression", "postfix_call_subscript", 
		"prefix_unary", "cast", "pow_root", "mult_div_mod", "add_sub", "bitleft_right", 
		"less_greater", "equal_notequal", "bitand", "bitxor", "bitor", "and", 
		"or", "type", "variable", "number", "string", "character", "bool", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'{'", "'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'**='", "'<<='", "'&='", "'^='", "'|='", "'('", "')'", "','", "'++'", 
		"'--'", "'['", "']'", "'+'", "'-'", "'!'", "'~'", "'**'", "'//'", "'*'", 
		"'/'", "'%'", "'<<'", "'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'==='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'[]'", "'return'", "'break'", 
		"'continue'", "'if'", "'else'", "'for'", "'while'", "'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "RETURN", 
		"BREAK", "CONTINUE", "IF", "ELSE", "FOR", "WHILE", "DO", "TYPE", "NUMBER", 
		"STRING", "CHARACTER", "BOOLEAN", "VARIABLE", "WHITESPACE"
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(116);
				element();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
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

	public static class StatementContext extends ParserRuleContext {
		public Basic_statementContext basic_statement() {
			return getRuleContext(Basic_statementContext.class,0);
		}
		public Flow_statementContext flow_statement() {
			return getRuleContext(Flow_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch (_input.LA(1)) {
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case TYPE:
			case NUMBER:
			case STRING:
			case CHARACTER:
			case BOOLEAN:
			case VARIABLE:
				{
				setState(128);
				basic_statement();
				}
				break;
			case RETURN:
			case BREAK:
			case CONTINUE:
				{
				setState(129);
				flow_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
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

	public static class Basic_statementContext extends ParserRuleContext {
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
		public Basic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBasic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBasic_statement(this);
		}
	}

	public final Basic_statementContext basic_statement() throws RecognitionException {
		Basic_statementContext _localctx = new Basic_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basic_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				discarded_statement();
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

	public static class Flow_statementContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Flow_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterFlow_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitFlow_statement(this);
		}
	}

	public final Flow_statementContext flow_statement() throws RecognitionException {
		Flow_statementContext _localctx = new Flow_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flow_statement);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				return_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				continue_statement();
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
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Do_while_loopContext do_while_loop() {
			return getRuleContext(Do_while_loopContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 10, RULE_block_element);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				else_if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				while_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				do_while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				block();
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__1);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << IF) | (1L << ELSE) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				{
				setState(156);
				element();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		enterRule(_localctx, 14, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
			setState(165);
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
		enterRule(_localctx, 16, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			type();
			setState(168);
			variable();
			setState(169);
			match(T__3);
			setState(170);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				direct_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				sum_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				difference_assign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				product_assign();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				quotient_assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				modulus_assign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				power_assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				bit_left_assign();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(180);
				bit_right_assign();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(181);
				bit_and_assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(182);
				bit_xor_assign();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(183);
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
		enterRule(_localctx, 20, RULE_discarded_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 22, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(RETURN);
			setState(189);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CompilerParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBreak_statement(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BREAK);
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

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CompilerParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitContinue_statement(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CONTINUE);
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
		enterRule(_localctx, 28, RULE_direct_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			variable();
			setState(196);
			match(T__3);
			setState(197);
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
		enterRule(_localctx, 30, RULE_sum_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			variable();
			setState(200);
			match(T__4);
			setState(201);
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
		enterRule(_localctx, 32, RULE_difference_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			variable();
			setState(204);
			match(T__5);
			setState(205);
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
		enterRule(_localctx, 34, RULE_product_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			variable();
			setState(208);
			match(T__6);
			setState(209);
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
		enterRule(_localctx, 36, RULE_quotient_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			variable();
			setState(212);
			match(T__7);
			setState(213);
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
		enterRule(_localctx, 38, RULE_modulus_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			variable();
			setState(216);
			match(T__8);
			setState(217);
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
		enterRule(_localctx, 40, RULE_power_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			variable();
			setState(220);
			match(T__9);
			setState(221);
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
		enterRule(_localctx, 42, RULE_bit_left_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			variable();
			setState(224);
			match(T__10);
			setState(225);
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
		enterRule(_localctx, 44, RULE_bit_right_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			variable();
			setState(228);
			match(T__10);
			setState(229);
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
		enterRule(_localctx, 46, RULE_bit_and_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			variable();
			setState(232);
			match(T__11);
			setState(233);
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
		enterRule(_localctx, 48, RULE_bit_xor_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			variable();
			setState(236);
			match(T__12);
			setState(237);
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
		enterRule(_localctx, 50, RULE_bit_or_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			variable();
			setState(240);
			match(T__13);
			setState(241);
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
		enterRule(_localctx, 52, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(IF);
			setState(244);
			match(T__14);
			setState(245);
			expression(0);
			setState(246);
			match(T__15);
			setState(247);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_else_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ELSE);
			setState(250);
			match(IF);
			setState(251);
			match(T__14);
			setState(253);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(252);
				expression(0);
				}
			}

			setState(255);
			match(T__15);
			setState(256);
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
		enterRule(_localctx, 56, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ELSE);
			setState(259);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
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
		enterRule(_localctx, 58, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(FOR);
			setState(262);
			match(T__14);
			setState(264);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(263);
				initialization();
				}
			}

			setState(266);
			match(T__0);
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(267);
				condition();
				}
			}

			setState(270);
			match(T__0);
			setState(272);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << TYPE) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(271);
				update();
				}
			}

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

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 60, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(WHILE);
			setState(278);
			match(T__14);
			setState(280);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(279);
				condition();
				}
			}

			setState(282);
			match(T__15);
			setState(283);
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

	public static class Do_while_loopContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CompilerParser.DO, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CompilerParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Do_while_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDo_while_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDo_while_loop(this);
		}
	}

	public final Do_while_loopContext do_while_loop() throws RecognitionException {
		Do_while_loopContext _localctx = new Do_while_loopContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_do_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DO);
			setState(286);
			element();
			setState(287);
			match(WHILE);
			setState(288);
			match(T__14);
			setState(290);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(289);
				condition();
				}
			}

			setState(292);
			match(T__15);
			setState(293);
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

	public static class InitializationContext extends ParserRuleContext {
		public Basic_statementContext basic_statement() {
			return getRuleContext(Basic_statementContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			basic_statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class UpdateContext extends ParserRuleContext {
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
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				instantiation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				discarded_statement();
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
		enterRule(_localctx, 70, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			type();
			setState(306);
			variable();
			{
			setState(307);
			match(T__14);
			setState(320);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						type();
						setState(309);
						variable();
						setState(310);
						match(T__16);
						}
						} 
					}
					setState(316);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(317);
				type();
				setState(318);
				variable();
				}
			}

			setState(322);
			match(T__15);
			}
			setState(324);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
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
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(327);
				match(T__14);
				setState(328);
				expression(0);
				setState(329);
				match(T__15);
				}
				break;
			case 2:
				{
				setState(331);
				number();
				}
				break;
			case 3:
				{
				setState(332);
				string();
				}
				break;
			case 4:
				{
				setState(333);
				character();
				}
				break;
			case 5:
				{
				setState(334);
				bool();
				}
				break;
			case 6:
				{
				setState(335);
				array();
				}
				break;
			case 7:
				{
				setState(336);
				variable();
				}
				break;
			case 8:
				{
				setState(337);
				prefix_unary();
				setState(338);
				expression(13);
				}
				break;
			case 9:
				{
				setState(340);
				cast();
				setState(341);
				expression(12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(346);
						pow_root();
						setState(347);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(349);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(350);
						mult_div_mod();
						setState(351);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(354);
						add_sub();
						setState(355);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(358);
						bitleft_right();
						setState(359);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(361);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(362);
						less_greater();
						setState(363);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(366);
						equal_notequal();
						setState(367);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370);
						bitand();
						setState(371);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(374);
						bitxor();
						setState(375);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(377);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(378);
						bitor();
						setState(379);
						expression(4);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(381);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(382);
						and();
						setState(383);
						expression(3);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(385);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(386);
						or();
						setState(387);
						expression(2);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(390);
						postfix_call_subscript();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 74, RULE_postfix_call_subscript);
		int _la;
		try {
			int _alt;
			setState(415);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(T__18);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__14);
				setState(408);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
					{
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(399);
							expression(0);
							setState(400);
							match(T__16);
							}
							} 
						}
						setState(406);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					setState(407);
					expression(0);
					}
				}

				setState(410);
				match(T__15);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				match(T__19);
				setState(412);
				expression(0);
				setState(413);
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
		enterRule(_localctx, 76, RULE_prefix_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
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

	public static class CastContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__14);
			setState(420);
			type();
			setState(421);
			match(T__15);
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
		enterRule(_localctx, 80, RULE_pow_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		enterRule(_localctx, 82, RULE_mult_div_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
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
		enterRule(_localctx, 84, RULE_add_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		enterRule(_localctx, 86, RULE_bitleft_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		enterRule(_localctx, 88, RULE_less_greater);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 90, RULE_equal_notequal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		enterRule(_localctx, 92, RULE_bitand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 94, RULE_bitxor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 96, RULE_bitor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 98, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		enterRule(_localctx, 100, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__43);
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
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(TYPE);
			setState(447);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(446);
				match(T__44);
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
		enterRule(_localctx, 104, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 106, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
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
		enterRule(_localctx, 108, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		enterRule(_localctx, 110, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(CompilerParser.BOOLEAN, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(BOOLEAN);
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
		enterRule(_localctx, 114, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__19);
			setState(469);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << NUMBER) | (1L << STRING) | (1L << CHARACTER) | (1L << BOOLEAN) | (1L << VARIABLE))) != 0)) {
				{
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(460);
						expression(0);
						setState(461);
						match(T__16);
						}
						} 
					}
					setState(467);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(468);
				expression(0);
				}
			}

			setState(471);
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
		case 36:
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
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\7\2x\n\2"+
		"\f\2\16\2{\13\2\3\2\3\2\3\3\3\3\5\3\u0081\n\3\3\4\3\4\5\4\u0085\n\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\5\6\u0092\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\7\b\u00a0\n\b\f\b\16\b"+
		"\u00a3\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bb\n\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0100\n\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\5\37\u010b\n\37\3\37\3\37\5\37\u010f\n\37\3"+
		"\37\3\37\5\37\u0113\n\37\3\37\3\37\3\37\3 \3 \3 \5 \u011b\n \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\5!\u0125\n!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u0132"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\7%\u013b\n%\f%\16%\u013e\13%\3%\3%\3%\5%\u0143"+
		"\n%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u015a\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\7&\u018a\n&\f&\16&\u018d\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0195"+
		"\n\'\f\'\16\'\u0198\13\'\3\'\5\'\u019b\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01a2"+
		"\n\'\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\5\65\u01c2\n\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3;\7;\u01d2\n;\f;\16;\u01d5"+
		"\13;\3;\5;\u01d8\n;\3;\3;\3;\2\3J<\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\t\4\2\24\25"+
		"\30\33\3\2\34\35\3\2\36 \3\2\30\31\3\2!\"\3\2#&\3\2\')\u01e3\2y\3\2\2"+
		"\2\4\u0080\3\2\2\2\6\u0084\3\2\2\2\b\u008c\3\2\2\2\n\u0091\3\2\2\2\f\u009b"+
		"\3\2\2\2\16\u009d\3\2\2\2\20\u00a6\3\2\2\2\22\u00a9\3\2\2\2\24\u00ba\3"+
		"\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2\2\32\u00c1\3\2\2\2\34\u00c3\3\2"+
		"\2\2\36\u00c5\3\2\2\2 \u00c9\3\2\2\2\"\u00cd\3\2\2\2$\u00d1\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00d9\3\2\2\2*\u00dd\3\2\2\2,\u00e1\3\2\2\2.\u00e5\3\2\2\2\60"+
		"\u00e9\3\2\2\2\62\u00ed\3\2\2\2\64\u00f1\3\2\2\2\66\u00f5\3\2\2\28\u00fb"+
		"\3\2\2\2:\u0104\3\2\2\2<\u0107\3\2\2\2>\u0117\3\2\2\2@\u011f\3\2\2\2B"+
		"\u0129\3\2\2\2D\u012b\3\2\2\2F\u0131\3\2\2\2H\u0133\3\2\2\2J\u0159\3\2"+
		"\2\2L\u01a1\3\2\2\2N\u01a3\3\2\2\2P\u01a5\3\2\2\2R\u01a9\3\2\2\2T\u01ab"+
		"\3\2\2\2V\u01ad\3\2\2\2X\u01af\3\2\2\2Z\u01b1\3\2\2\2\\\u01b3\3\2\2\2"+
		"^\u01b5\3\2\2\2`\u01b7\3\2\2\2b\u01b9\3\2\2\2d\u01bb\3\2\2\2f\u01bd\3"+
		"\2\2\2h\u01bf\3\2\2\2j\u01c3\3\2\2\2l\u01c5\3\2\2\2n\u01c7\3\2\2\2p\u01c9"+
		"\3\2\2\2r\u01cb\3\2\2\2t\u01cd\3\2\2\2vx\5\4\3\2wv\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\2\2\3}\3\3\2\2\2~\u0081\5"+
		"\6\4\2\177\u0081\5\f\7\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\5\3\2"+
		"\2\2\u0082\u0085\5\b\5\2\u0083\u0085\5\n\6\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\3\2\2\u0087\7\3\2\2\2"+
		"\u0088\u008d\5\20\t\2\u0089\u008d\5\22\n\2\u008a\u008d\5\24\13\2\u008b"+
		"\u008d\5\26\f\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\t\3\2\2\2\u008e\u0092\5\30\r\2\u008f"+
		"\u0092\5\32\16\2\u0090\u0092\5\34\17\2\u0091\u008e\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\13\3\2\2\2\u0093\u009c\5\66\34\2\u0094"+
		"\u009c\58\35\2\u0095\u009c\5:\36\2\u0096\u009c\5<\37\2\u0097\u009c\5>"+
		" \2\u0098\u009c\5@!\2\u0099\u009c\5H%\2\u009a\u009c\5\16\b\2\u009b\u0093"+
		"\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2"+
		"\2\2\u009c\r\3\2\2\2\u009d\u00a1\7\4\2\2\u009e\u00a0\5\4\3\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\17\3\2\2"+
		"\2\u00a6\u00a7\5h\65\2\u00a7\u00a8\5j\66\2\u00a8\21\3\2\2\2\u00a9\u00aa"+
		"\5h\65\2\u00aa\u00ab\5j\66\2\u00ab\u00ac\7\6\2\2\u00ac\u00ad\5J&\2\u00ad"+
		"\23\3\2\2\2\u00ae\u00bb\5\36\20\2\u00af\u00bb\5 \21\2\u00b0\u00bb\5\""+
		"\22\2\u00b1\u00bb\5$\23\2\u00b2\u00bb\5&\24\2\u00b3\u00bb\5(\25\2\u00b4"+
		"\u00bb\5*\26\2\u00b5\u00bb\5,\27\2\u00b6\u00bb\5.\30\2\u00b7\u00bb\5\60"+
		"\31\2\u00b8\u00bb\5\62\32\2\u00b9\u00bb\5\64\33\2\u00ba\u00ae\3\2\2\2"+
		"\u00ba\u00af\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2"+
		"\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\25\3\2\2\2\u00bc\u00bd\5J&\2\u00bd\27\3\2\2\2\u00be\u00bf\7"+
		"\60\2\2\u00bf\u00c0\5J&\2\u00c0\31\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2"+
		"\33\3\2\2\2\u00c3\u00c4\7\62\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\5j\66\2"+
		"\u00c6\u00c7\7\6\2\2\u00c7\u00c8\5J&\2\u00c8\37\3\2\2\2\u00c9\u00ca\5"+
		"j\66\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\5J&\2\u00cc!\3\2\2\2\u00cd\u00ce"+
		"\5j\66\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5J&\2\u00d0#\3\2\2\2\u00d1\u00d2"+
		"\5j\66\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\5J&\2\u00d4%\3\2\2\2\u00d5\u00d6"+
		"\5j\66\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5J&\2\u00d8\'\3\2\2\2\u00d9\u00da"+
		"\5j\66\2\u00da\u00db\7\13\2\2\u00db\u00dc\5J&\2\u00dc)\3\2\2\2\u00dd\u00de"+
		"\5j\66\2\u00de\u00df\7\f\2\2\u00df\u00e0\5J&\2\u00e0+\3\2\2\2\u00e1\u00e2"+
		"\5j\66\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4\5J&\2\u00e4-\3\2\2\2\u00e5\u00e6"+
		"\5j\66\2\u00e6\u00e7\7\r\2\2\u00e7\u00e8\5J&\2\u00e8/\3\2\2\2\u00e9\u00ea"+
		"\5j\66\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\5J&\2\u00ec\61\3\2\2\2\u00ed"+
		"\u00ee\5j\66\2\u00ee\u00ef\7\17\2\2\u00ef\u00f0\5J&\2\u00f0\63\3\2\2\2"+
		"\u00f1\u00f2\5j\66\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\5J&\2\u00f4\65\3"+
		"\2\2\2\u00f5\u00f6\7\63\2\2\u00f6\u00f7\7\21\2\2\u00f7\u00f8\5J&\2\u00f8"+
		"\u00f9\7\22\2\2\u00f9\u00fa\5\4\3\2\u00fa\67\3\2\2\2\u00fb\u00fc\7\64"+
		"\2\2\u00fc\u00fd\7\63\2\2\u00fd\u00ff\7\21\2\2\u00fe\u0100\5J&\2\u00ff"+
		"\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7\22"+
		"\2\2\u0102\u0103\5\4\3\2\u01039\3\2\2\2\u0104\u0105\7\64\2\2\u0105\u0106"+
		"\5\4\3\2\u0106;\3\2\2\2\u0107\u0108\7\65\2\2\u0108\u010a\7\21\2\2\u0109"+
		"\u010b\5B\"\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\7\3\2\2\u010d\u010f\5D#\2\u010e\u010d\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\3\2\2\u0111\u0113\5F$\2\u0112"+
		"\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\22"+
		"\2\2\u0115\u0116\5\4\3\2\u0116=\3\2\2\2\u0117\u0118\7\66\2\2\u0118\u011a"+
		"\7\21\2\2\u0119\u011b\5D#\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7\22\2\2\u011d\u011e\5\4\3\2\u011e?\3\2\2\2"+
		"\u011f\u0120\7\67\2\2\u0120\u0121\5\4\3\2\u0121\u0122\7\66\2\2\u0122\u0124"+
		"\7\21\2\2\u0123\u0125\5D#\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\7\22\2\2\u0127\u0128\7\3\2\2\u0128A\3\2\2\2"+
		"\u0129\u012a\5\b\5\2\u012aC\3\2\2\2\u012b\u012c\5J&\2\u012cE\3\2\2\2\u012d"+
		"\u0132\5\20\t\2\u012e\u0132\5\22\n\2\u012f\u0132\5\24\13\2\u0130\u0132"+
		"\5\26\f\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0130\3\2\2\2\u0132G\3\2\2\2\u0133\u0134\5h\65\2\u0134\u0135\5"+
		"j\66\2\u0135\u0142\7\21\2\2\u0136\u0137\5h\65\2\u0137\u0138\5j\66\2\u0138"+
		"\u0139\7\23\2\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013b\u013e\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013f\u0140\5h\65\2\u0140\u0141\5j\66\2\u0141\u0143\3\2"+
		"\2\2\u0142\u013c\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\22\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5\4\3\2\u0147I\3\2\2\2"+
		"\u0148\u0149\b&\1\2\u0149\u014a\7\21\2\2\u014a\u014b\5J&\2\u014b\u014c"+
		"\7\22\2\2\u014c\u015a\3\2\2\2\u014d\u015a\5l\67\2\u014e\u015a\5n8\2\u014f"+
		"\u015a\5p9\2\u0150\u015a\5r:\2\u0151\u015a\5t;\2\u0152\u015a\5j\66\2\u0153"+
		"\u0154\5N(\2\u0154\u0155\5J&\17\u0155\u015a\3\2\2\2\u0156\u0157\5P)\2"+
		"\u0157\u0158\5J&\16\u0158\u015a\3\2\2\2\u0159\u0148\3\2\2\2\u0159\u014d"+
		"\3\2\2\2\u0159\u014e\3\2\2\2\u0159\u014f\3\2\2\2\u0159\u0150\3\2\2\2\u0159"+
		"\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2"+
		"\2\2\u015a\u018b\3\2\2\2\u015b\u015c\f\r\2\2\u015c\u015d\5R*\2\u015d\u015e"+
		"\5J&\16\u015e\u018a\3\2\2\2\u015f\u0160\f\f\2\2\u0160\u0161\5T+\2\u0161"+
		"\u0162\5J&\r\u0162\u018a\3\2\2\2\u0163\u0164\f\13\2\2\u0164\u0165\5V,"+
		"\2\u0165\u0166\5J&\f\u0166\u018a\3\2\2\2\u0167\u0168\f\n\2\2\u0168\u0169"+
		"\5X-\2\u0169\u016a\5J&\13\u016a\u018a\3\2\2\2\u016b\u016c\f\t\2\2\u016c"+
		"\u016d\5Z.\2\u016d\u016e\5J&\n\u016e\u018a\3\2\2\2\u016f\u0170\f\b\2\2"+
		"\u0170\u0171\5\\/\2\u0171\u0172\5J&\t\u0172\u018a\3\2\2\2\u0173\u0174"+
		"\f\7\2\2\u0174\u0175\5^\60\2\u0175\u0176\5J&\b\u0176\u018a\3\2\2\2\u0177"+
		"\u0178\f\6\2\2\u0178\u0179\5`\61\2\u0179\u017a\5J&\7\u017a\u018a\3\2\2"+
		"\2\u017b\u017c\f\5\2\2\u017c\u017d\5b\62\2\u017d\u017e\5J&\6\u017e\u018a"+
		"\3\2\2\2\u017f\u0180\f\4\2\2\u0180\u0181\5d\63\2\u0181\u0182\5J&\5\u0182"+
		"\u018a\3\2\2\2\u0183\u0184\f\3\2\2\u0184\u0185\5f\64\2\u0185\u0186\5J"+
		"&\4\u0186\u018a\3\2\2\2\u0187\u0188\f\20\2\2\u0188\u018a\5L\'\2\u0189"+
		"\u015b\3\2\2\2\u0189\u015f\3\2\2\2\u0189\u0163\3\2\2\2\u0189\u0167\3\2"+
		"\2\2\u0189\u016b\3\2\2\2\u0189\u016f\3\2\2\2\u0189\u0173\3\2\2\2\u0189"+
		"\u0177\3\2\2\2\u0189\u017b\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0183\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018cK\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u01a2\7\24\2\2"+
		"\u018f\u01a2\7\25\2\2\u0190\u019a\7\21\2\2\u0191\u0192\5J&\2\u0192\u0193"+
		"\7\23\2\2\u0193\u0195\3\2\2\2\u0194\u0191\3\2\2\2\u0195\u0198\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0199\u019b\5J&\2\u019a\u0196\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u01a2\7\22\2\2\u019d\u019e\7\26\2\2\u019e\u019f\5"+
		"J&\2\u019f\u01a0\7\27\2\2\u01a0\u01a2\3\2\2\2\u01a1\u018e\3\2\2\2\u01a1"+
		"\u018f\3\2\2\2\u01a1\u0190\3\2\2\2\u01a1\u019d\3\2\2\2\u01a2M\3\2\2\2"+
		"\u01a3\u01a4\t\2\2\2\u01a4O\3\2\2\2\u01a5\u01a6\7\21\2\2\u01a6\u01a7\5"+
		"h\65\2\u01a7\u01a8\7\22\2\2\u01a8Q\3\2\2\2\u01a9\u01aa\t\3\2\2\u01aaS"+
		"\3\2\2\2\u01ab\u01ac\t\4\2\2\u01acU\3\2\2\2\u01ad\u01ae\t\5\2\2\u01ae"+
		"W\3\2\2\2\u01af\u01b0\t\6\2\2\u01b0Y\3\2\2\2\u01b1\u01b2\t\7\2\2\u01b2"+
		"[\3\2\2\2\u01b3\u01b4\t\b\2\2\u01b4]\3\2\2\2\u01b5\u01b6\7*\2\2\u01b6"+
		"_\3\2\2\2\u01b7\u01b8\7+\2\2\u01b8a\3\2\2\2\u01b9\u01ba\7,\2\2\u01bac"+
		"\3\2\2\2\u01bb\u01bc\7-\2\2\u01bce\3\2\2\2\u01bd\u01be\7.\2\2\u01beg\3"+
		"\2\2\2\u01bf\u01c1\78\2\2\u01c0\u01c2\7/\2\2\u01c1\u01c0\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2i\3\2\2\2\u01c3\u01c4\7=\2\2\u01c4k\3\2\2\2\u01c5"+
		"\u01c6\79\2\2\u01c6m\3\2\2\2\u01c7\u01c8\7:\2\2\u01c8o\3\2\2\2\u01c9\u01ca"+
		"\7;\2\2\u01caq\3\2\2\2\u01cb\u01cc\7<\2\2\u01ccs\3\2\2\2\u01cd\u01d7\7"+
		"\26\2\2\u01ce\u01cf\5J&\2\u01cf\u01d0\7\23\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01ce\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d8\5J&\2\u01d7\u01d3"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7\27\2\2"+
		"\u01dau\3\2\2\2\34y\u0080\u0084\u008c\u0091\u009b\u00a1\u00ba\u00ff\u010a"+
		"\u010e\u0112\u011a\u0124\u0131\u013c\u0142\u0159\u0189\u018b\u0196\u019a"+
		"\u01a1\u01c1\u01d3\u01d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}