package org.commonmark.internal.inline;

import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class BoldDelimiterProcessor extends EmphasisDelimiterProcessor {

    public BoldDelimiterProcessor() {
        super('*');
    }

    @Override
    public void process(Text opener, Text closer, int delimiterUse) {
        String singleDelimiter = String.valueOf(getOpeningCharacter());
        Node emphasis = new StrongEmphasis(singleDelimiter);
        Node tmp = opener.getNext();
        while (tmp != null && tmp != closer) {
            Node next = tmp.getNext();
            emphasis.appendChild(tmp);
            tmp = next;
        }

        opener.insertAfter(emphasis);
    }
}
