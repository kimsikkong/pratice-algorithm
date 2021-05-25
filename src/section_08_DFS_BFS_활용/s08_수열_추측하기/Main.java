package section_08_DFS_BFS_활용.s08_수열_추측하기;

import java.util.Scanner;

public class Main {

    public static int n;
    public static int f;
    public static int[] chk;
    public static int[] pm;
    public static int[][] c;
    public static boolean flag;

    public static int choice(int n, int r) {
        if (c[n][r] != 0) return c[n][r];
        if (n == r) return c[n][r] = 1;
        if (r == 0) return c[n][r] = 1;
        return c[n][r] = choice(n - 1, r - 1) + choice(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                flag = true;
                for (int x : pm) {
                    System.out.print(x + " ");
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    pm[L] = i;
                    DFS(L + 1, sum + (i * c[n - 1][L]));
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        f = scanner.nextInt();
        chk = new int[n + 1];
        pm = new int[n];
        c = new int[n][n];
        for (int i = 0; i < n; i++) {
            choice(n - 1, i);
        }

        Main T = new Main();
        T.DFS(0, 0);
    }
}
