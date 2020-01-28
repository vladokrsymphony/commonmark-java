package org.commonmark.internal.inline;

import org.commonmark.node.Deleted;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class DeletedDelimiterProcessor extends EmphasisDelimiterProcessor {

    public DeletedDelimiterProcessor() {
        super('-');
    }

    @Override
    public void process(Text opener, Text closer, int delimiterUse) {
        String singleDelimiter = String.valueOf(getOpeningCharacter());
        Node emphasis = new Deleted(singleDelimiter);
        Node tmp = opener.getNext();
        while (tmp != null && tmp != closer) {
            Node next = tmp.getNext();
            emphasis.appendChild(tmp);
            tmp = next;
        }

        opener.insertAfter(emphasis);
    }
}
