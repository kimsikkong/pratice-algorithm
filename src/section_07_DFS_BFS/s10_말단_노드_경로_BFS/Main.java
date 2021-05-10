package section_07_DFS_BFS.s10_말단_노드_경로_BFS;

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

    public int BFS(Node root) {
        LinkedList<Node> Q = new LinkedList<>();
        int L = 0;
        Q.offer(root);

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node c = Q.poll();
                if (c.lt != null) Q.offer(c.lt);
                if (c.rt != null) Q.offer(c.rt);
                if (c.lt == null && c.rt == null) return L;
            }

            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        System.out.println(T.BFS(T.root));
    }
}
