package org.krvlado.commonmark.test;

import org.krvlado.commonmark.parser.Parser;
import org.krvlado.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.testutil.RenderingTestCase;

public class CoreRenderingTestCase extends RenderingTestCase {

    private static final Parser PARSER = Parser.builder().build();
    private static final HtmlRenderer RENDERER = HtmlRenderer.builder().build();

    @Override
    protected String render(String source) {
        return RENDERER.render(PARSER.parse(source));
    }
}
