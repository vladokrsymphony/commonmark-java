package org.krvlado.commonmark.internal;

import org.krvlado.commonmark.node.Block;
import org.krvlado.commonmark.node.Document;
import org.krvlado.commonmark.parser.block.AbstractBlockParser;
import org.krvlado.commonmark.parser.block.BlockContinue;
import org.krvlado.commonmark.parser.block.ParserState;

public class DocumentBlockParser extends AbstractBlockParser {

    private final Document document = new Document();

    @Override
    public boolean isContainer() {
        return true;
    }

    @Override
    public boolean canContain(Block block) {
        return true;
    }

    @Override
    public Document getBlock() {
        return document;
    }

    @Override
    public BlockContinue tryContinue(ParserState state) {
        return BlockContinue.atIndex(state.getIndex());
    }

    @Override
    public void addLine(CharSequence line) {
    }

}
