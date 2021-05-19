package section_08_DFS_BFS_활용.s07_조합의_경우수;

import java.util.Scanner;

public class Main {

    public static int[][] cache = new int[34][34];

    public int recursion(int n, int r) {
        if (n == r) return 1;
        else if (r == 1) return n;
        else {
            if (cache[n - 1][r - 1] == 0) cache[n - 1][r - 1] = recursion(n - 1, r - 1);
            if (cache[n - 1][r] == 0) cache[n - 1][r] = recursion(n - 1, r);
            return cache[n - 1][r - 1] + cache[n - 1][r];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.recursion(n, r));
    }
}
