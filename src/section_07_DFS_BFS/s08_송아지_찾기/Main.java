package section_07_DFS_BFS.s08_송아지_찾기;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public int[] dis = {-1, 1, 5};
    public int[] ch = new int[10001];

    public int BFS(int S, int E) {
        LinkedList<Integer> Q = new LinkedList<>();
        ch[S] = 1;
        Q.offer(S);
        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int k  = Q.poll();
                for (int di : dis) {
                    int nx = k + di;
                    if (nx == E) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] != 1) {
                        Q.offer(nx);
                        ch[nx] = 1;
                    }
                }
            }

            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.BFS(S, E));
    }

}
