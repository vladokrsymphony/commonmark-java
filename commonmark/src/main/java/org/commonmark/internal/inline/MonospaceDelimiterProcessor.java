package org.commonmark.internal.inline;

import org.commonmark.node.Node;
import org.commonmark.node.Monospace;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

public class MonospaceDelimiterProcessor implements DelimiterProcessor {

    public MonospaceDelimiterProcessor() {
        
    }

    @Override
    public void process(Text opener, Text closer, int delimiterUse) {
        String singleDelimiter = String.valueOf(getOpeningCharacter());
        Node prefromatted = new Monospace(singleDelimiter);
        Node tmp = opener.getNext();
        while (tmp != null && tmp != closer) {
            Node next = tmp.getNext();
            prefromatted.appendChild(tmp);
            tmp = next;
        }

        opener.insertAfter(prefromatted);
    }

    @Override
    public char getOpeningCharacter() {
        return '{';
    }

    @Override
    public char getClosingCharacter() {
        return '}';
    }

    @Override
    public int getMinLength() {
        return 2;
    }

    @Override
    public int getDelimiterUse(DelimiterRun opener, DelimiterRun closer) {
        return 2;
    }
}
