package org.krvlado.commonmark.internal;

import org.krvlado.commonmark.node.LinkReferenceDefinition;
import org.krvlado.commonmark.parser.InlineParserContext;
import org.krvlado.commonmark.parser.delimiter.DelimiterProcessor;

import java.util.List;
import java.util.Map;

public class InlineParserContextImpl implements InlineParserContext {

    private final List<DelimiterProcessor> delimiterProcessors;
    private final Map<String, LinkReferenceDefinition> linkReferenceDefinitions;

    public InlineParserContextImpl(List<DelimiterProcessor> delimiterProcessors,
                                   Map<String, LinkReferenceDefinition> linkReferenceDefinitions) {
        this.delimiterProcessors = delimiterProcessors;
        this.linkReferenceDefinitions = linkReferenceDefinitions;
    }

    @Override
    public List<DelimiterProcessor> getCustomDelimiterProcessors() {
        return delimiterProcessors;
    }

    @Override
    public LinkReferenceDefinition getLinkReferenceDefinition(String label) {
        return linkReferenceDefinitions.get(label);
    }
}
