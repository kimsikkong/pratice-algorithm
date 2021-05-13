package section_07_DFS_BFS.s13_경로탐색_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int[] chk;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int answer = 0;

    public void DFS(int node) {
        if (node == 5) answer++;
        else {
            ArrayList<Integer> list = graph.get(node);
            for (int k : list) {
                if (chk[k] != 1) {
                    chk[k] = 1;
                    DFS(k);
                    chk[k] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        chk = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        Main T = new Main();
        chk[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
