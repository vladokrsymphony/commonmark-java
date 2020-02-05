package org.krvlado.commonmark.node;

public class Subscript extends Node implements Delimited {

    private String delimiter;

    public Subscript() {
    }

    public Subscript(String delimiter) {
        this.delimiter = delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String getOpeningDelimiter() {
        return delimiter;
    }

    @Override
    public String getClosingDelimiter() {
        return delimiter;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
