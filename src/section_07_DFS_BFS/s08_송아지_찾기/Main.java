package section_07_DFS_BFS.s08_송아지_찾기;

import java.util.LinkedList;
import java.util.Scanner;

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

    public int solution(int S, int E) {
        this.root = new Node(S);
        return this.BFS(E);
    }

    public int BFS(int E) {
        LinkedList<Node> Q = new LinkedList<>();
        Q.offer(this.root);
        int L = 0;
        int k = -1;

        while (k != E) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node c = Q.poll();
                k = c.val;
                if (k == E) return L;
                else if (k > E) return L + (k - E);
                else {
                    if (E - k >= 3) c.rt = new Node(k + 5);
                    else c.lt = new Node(k + 1);
                }
                if (c.lt != null) Q.offer(c.lt);
                if (c.rt != null) Q.offer(c.rt);
            }

            L++;
        }

        return L - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.solution(S, E));
    }

}
