package org.krvlado.commonmark.internal.inline;

import org.krvlado.commonmark.node.Node;
import org.krvlado.commonmark.node.Text;
import org.krvlado.commonmark.node.Underline;

public class UnderlineDelimiterProcessor extends EmphasisDelimiterProcessor {

    public UnderlineDelimiterProcessor() {
        super('+');
    }

    @Override
    public void process(Text opener, Text closer, int delimiterUse) {
        String singleDelimiter = String.valueOf(getOpeningCharacter());
        Node emphasis = new Underline(singleDelimiter);
        Node tmp = opener.getNext();
        while (tmp != null && tmp != closer) {
            Node next = tmp.getNext();
            emphasis.appendChild(tmp);
            tmp = next;
        }

        opener.insertAfter(emphasis);
    }
}
