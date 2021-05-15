package section_08_DFS_BFS_활용.s01_합이_같은_부분집합;

import java.util.Scanner;

public class Main_2 {

    public static int total;
    public static int n;
    public static String answer = "NO";
    public static boolean flag;

    public void DFS(int idx, int sum, int[] arr) {
        if (flag) return;
        if (sum > (total / 2)) return;
        if (idx == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(idx + 1, sum + arr[idx], arr);
            DFS(idx + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        Main_2 T = new Main_2();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
