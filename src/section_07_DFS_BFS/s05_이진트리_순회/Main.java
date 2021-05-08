package section_07_DFS_BFS.s05_이진트리_순회;

class Node {

    public Node lt;
    public Node rt;
    public int val;

    public Node(int val) {
        this.val = val;
    }
}

public class Main {

    public Node node;

    public void DFS(Node node) {
        if (node == null) return;
        else {
            DFS(node.lt);
            DFS(node.rt);
            System.out.print(node.val + " ");
        }
    }


    public static void main(String[] args) {

        //          1
        //    2          3
        //  4   5      6    7

        Main tree = new Main();
        tree.node = new Node(1);
        tree.node.lt = new Node(2);
        tree.node.lt.lt = new Node(4);
        tree.node.lt.rt = new Node(5);

        tree.node.rt = new Node(3);
        tree.node.rt.lt = new Node(6);
        tree.node.rt.rt = new Node(7);

        tree.DFS(tree.node);
    }
}
