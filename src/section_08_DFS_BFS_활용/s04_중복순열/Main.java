package section_08_DFS_BFS_활용.s04_중복순열;

import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        pm = new int[m];
        Main T = new Main();
        T.DFS(0);
    }
}
