package org.krvlado.commonmark.parser;

/**
 * Factory for custom inline parser.
 */
public interface InlineParserFactory {
    InlineParser create(InlineParserContext inlineParserContext);
}
