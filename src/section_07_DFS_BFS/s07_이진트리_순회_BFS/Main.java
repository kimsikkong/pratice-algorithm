package section_07_DFS_BFS.s07_이진트리_순회_BFS;


import java.util.LinkedList;

class Node {
    public Node lt;
    public Node rt;
    public int val;

    public Node(int val) {
        this.val = val;
    }
}

public class Main {

    public Node root;

    public void DFS(Node node) {
        LinkedList<Node> Q = new LinkedList<>();
        Q.offer(node);
        int L = 0;
        while (!Q.isEmpty()) {
            System.out.print(L + " : ");
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node c = Q.poll();
                System.out.print(c.val + " ");
                if (c.lt != null) Q.offer(c.lt);
                if (c.rt != null) Q.offer(c.rt);
            }

            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
