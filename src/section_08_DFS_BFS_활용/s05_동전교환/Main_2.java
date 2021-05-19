package section_08_DFS_BFS_활용.s05_동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_2 {

    public static int n;
    public static Integer[] arr;
    public static int m;
    public static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum) {
        if (sum > m) return;
        if (L >= answer) return;
        else if (sum == m) answer = Math.min(answer, L);
        else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = scanner.nextInt();
        Main_2 T = new Main_2();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
