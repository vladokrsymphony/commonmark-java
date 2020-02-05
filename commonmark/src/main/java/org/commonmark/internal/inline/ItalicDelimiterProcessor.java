package org.krvlado.commonmark.internal.inline;

import org.krvlado.commonmark.node.Emphasis;
import org.krvlado.commonmark.node.Node;
import org.krvlado.commonmark.node.Text;

public class ItalicDelimiterProcessor extends EmphasisDelimiterProcessor {

    public ItalicDelimiterProcessor() {
        super('_');
    }

    @Override
    public void process(Text opener, Text closer, int delimiterUse) {
        String singleDelimiter = String.valueOf(getOpeningCharacter());
        Node emphasis = new Emphasis(singleDelimiter);
        Node tmp = opener.getNext();
        while (tmp != null && tmp != closer) {
            Node next = tmp.getNext();
            emphasis.appendChild(tmp);
            tmp = next;
        }

        opener.insertAfter(emphasis);
    }
}
