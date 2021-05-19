package section_08_DFS_BFS_활용.s06_순열_구하기;

import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[] pm;
    public static int[] chk;

    public void DFS(int L, int[] arr) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (chk[i] == 0) {
                    chk[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1, arr);
                    chk[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        chk = new int[n];
        pm = new int[m];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        T.DFS(0, arr);
    }
}
