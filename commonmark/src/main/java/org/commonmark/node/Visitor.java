package org.krvlado.commonmark.node;

/**
 * Node visitor.
 * <p>
 * Implementations should subclass {@link AbstractVisitor} instead of implementing this directly.
 */
public interface Visitor {

    void visit(BlockQuote blockQuote);

    void visit(BulletList bulletList);

    void visit(Code code);

    void visit(Document document);

    void visit(Emphasis emphasis);

    void visit(FencedCodeBlock fencedCodeBlock);

    void visit(HardLineBreak hardLineBreak);

    void visit(Heading heading);

    void visit(ThematicBreak thematicBreak);

    void visit(HtmlInline htmlInline);

    void visit(HtmlBlock htmlBlock);

    void visit(Image image);

    void visit(IndentedCodeBlock indentedCodeBlock);

    void visit(Link link);

    void visit(ListItem listItem);

    void visit(OrderedList orderedList);

    void visit(Paragraph paragraph);

    void visit(SoftLineBreak softLineBreak);

    void visit(StrongEmphasis strongEmphasis);

    void visit(Text text);

    void visit(LinkReferenceDefinition linkReferenceDefinition);

    void visit(CustomBlock customBlock);

    void visit(CustomNode customNode);

    void visit(Underline underline);

    void visit(Deleted deleted);

    void visit(Superscript superscript);

    void visit(Subscript superscript);

    void visit(Monospace prefromatted);
}
