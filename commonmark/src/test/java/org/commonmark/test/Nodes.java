package org.krvlado.commonmark.test;

import org.krvlado.commonmark.node.Node;

import java.util.ArrayList;
import java.util.List;

public class Nodes {

    public static List<Node> getChildren(Node parent) {
        List<Node> children = new ArrayList<>();
        for (Node child = parent.getFirstChild(); child != null; child = child.getNext()) {
            children.add(child);
        }
        return children;
    }
}
