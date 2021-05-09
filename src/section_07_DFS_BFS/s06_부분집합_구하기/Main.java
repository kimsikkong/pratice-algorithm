package section_07_DFS_BFS.s06_부분집합_구하기;

import java.util.Scanner;

public class Main {

    public int[] chk;
    public int threshold;

    public void DFS(int n) {
        if (n == this.threshold) {
            for (int i = 1; i < chk.length; i++) {
                if (chk[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            this.chk[n] = 1;
            DFS(n + 1);
            this.chk[n] = 0;
            DFS(n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main T = new Main();
        T.threshold = n + 1;
        T.chk = new int[n + 1];
        T.DFS(1);
    }
}
