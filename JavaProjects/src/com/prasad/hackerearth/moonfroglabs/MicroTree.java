package com.prasad.hackerearth.moonfroglabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Micro is having a tree which is having
 N
 N nodes. Micro can perform some operations on the tree. In one operation he can select a node and remove it along with the entire subtree rooted at it, from its current position and attach it as child of some other node. He defines a functions
 f
 (
 X
 )
 f(X) on the tree, as the minimum number of operations needed to be done to make a straight chain of nodes out of the given tree, when the tree is rooted at node
 X
 X. Now Micro wants to find out the minimum of all the
 f
 (
 i
 )
 f(i) where
 1
 ≤
 i
 ≤
 N
 1≤i≤N.

 Input:
 First line consists of a single integer denoting
 N
 N.
 Following
 N
 −
 1
 N−1 lines consists of two space separated integers
 X
 X and
 Y
 Y denoting there is an edge between nodes
 X
 X and
 Y
 Y.

 Output:
 Print the required answer.

 Constraints:
 1
 ≤
 N
 ≤
 16
 1≤N≤16
 1
 ≤
 X
 ,
 Y
 ≤
 N
 1≤X,Y≤N

 Sample Input(Plaintext Link)
 5
 1 2
 1 3
 2 4
 2 5
 Sample Output(Plaintext Link)
 1

 */

public class MicroTree {

    public static void main(String[] args) {
        Node treeRootNode = new Node(null);
        treeRootNode.setId("root");
        // add child to root node
        Node childNode= addChild(treeRootNode, "child-1");
        // add child to the child node created above
        addChild(childNode, "child-11");
        addChild(childNode, "child-12");


        // add child to root node
        Node child2 = addChild(treeRootNode, "child-2");
        // add child to the child node created above
        addChild(child2, "child-21");


        printTree(treeRootNode, "-");
        System.out.println(child2.getChildren());

    }

    private static Node addChild(Node parent, String id) {
        Node node = new Node(parent);
        node.setId(id);
        parent.getChildren().add(node);
        return node;
    }

    private static void printTree(Node node, String appender) {
        System.out.println(appender + node.getId());
        for (Node each : node.getChildren()) {
            printTree(each, appender + appender);
        }
    }
}

class Node {
    private String id;
    private final List<Node> children = new ArrayList();
    private final Node parent;

    public Node(Node parent) {
        this.parent = parent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node getParent() {
        return parent;
    }

}
