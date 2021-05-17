package section_08_DFS_BFS_활용.s05_동전교환;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[] chk = new int[501];

    public int BFS(int idx, int[] arr) {
        LinkedList<Integer> Q = new LinkedList<>();
        Q.offer(arr[idx]);
        int L = 1;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int k = Q.poll();
                if (k == m) return L;
                for (int j = 0; j < n; j++) {
                    int x = arr[j] + k;
                    if (x == m) return L + 1;
                    if (x <= 500 && chk[x] == 0) {
                        Q.offer(x);
                        chk[x] = 1;
                    }
                }
            }

            L++;
        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        m = scanner.nextInt();

        Main T = new Main();
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            answer = Math.min(T.BFS(i, arr), answer);
            chk = new int[501];
        }

        System.out.print(answer);
    }
}
