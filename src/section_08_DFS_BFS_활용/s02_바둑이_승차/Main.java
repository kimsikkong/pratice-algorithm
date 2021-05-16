package section_08_DFS_BFS_활용.s02_바둑이_승차;

import java.util.Scanner;

public class Main {

    public static int max;
    public static int c;
    public static int n;

    public void DFS(int idx, int sum, int[] arr) {
        if (sum > c) return;
        if (idx == n) {
            max = Math.max(sum, max);
        } else {
            DFS(idx + 1, sum + arr[idx], arr);
            DFS(idx  + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Main T = new Main();
        T.DFS(0, 0, arr);
        System.out.println(max);
    }
}
