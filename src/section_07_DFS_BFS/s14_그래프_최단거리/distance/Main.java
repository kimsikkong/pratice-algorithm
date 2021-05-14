package section_07_DFS_BFS.s14_그래프_최단거리.distance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int[] chk;
    public static int[] dis;

    public void BFS() {
        LinkedList<ArrayList<Integer>> Q = new LinkedList<>();
        Q.offer(graph.get(1));
        chk[1] = 1;

        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                ArrayList<Integer> c = Q.poll();
                for (int x : c) {
                    if (chk[x] != 1) {
                        chk[x] = 1;
                        dis[x] = dis[graph.indexOf(c)] + 1;
                        Q.offer(graph.get(x));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        chk = new int[n + 1];
        dis = new int[n + 1];
        Main T = new Main();
        T.BFS();

        for (int i = 2; i < dis.length; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
