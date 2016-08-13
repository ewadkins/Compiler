package com.ericwadkins.compiler.components.elements;

import com.ericwadkins.compiler.CompileException;
import org.antlr.v4.runtime.Token;

/**
 * Created by ericwadkins on 8/11/16.
 */
public abstract class BlockElement extends Element {

    protected final Block block;

    public BlockElement(Block block, Block parent, Token token) {
        super(parent, token);
        this.block = block;
    }
}