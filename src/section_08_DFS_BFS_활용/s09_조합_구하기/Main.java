package section_08_DFS_BFS_활용.s09_조합_구하기;

import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[] combi;

    public void DFS(int L, int idx) {
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = idx; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        combi = new int[m];
        Main T = new Main();
        T.DFS(0, 1);
    }
}
