package section_07_DFS_BFS.s12_경로탐색_DFS;

import java.util.Scanner;

public class Main {

    public static int answer;
    public static int n;
    public static int[] chk;
    public static int[][] graph;

    public void DFS(int node) {
        for (int i = 1; i <= n; i++) {
            if (i == n && graph[node][i] == 1) answer++;
            else if (chk[i] != 1 && graph[node][i] == 1) {
                chk[i] = 1;
                DFS(i);
                chk[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int m = scanner.nextInt();
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }

        Main T = new Main();
        chk = new int[n + 1];
        chk[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
