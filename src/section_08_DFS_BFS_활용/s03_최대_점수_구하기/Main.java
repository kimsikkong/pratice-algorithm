package section_08_DFS_BFS_활용.s03_최대_점수_구하기;

import java.util.Scanner;

public class Main {

    public static int answer;
    public static int n;
    public static int m;

    public void DFS(int idx, int sum, int time, int[][] arr) {
        if (time > m ) return;
        else if (idx == n) answer = Math.max(answer, sum);
        else {
            DFS(idx + 1, sum + arr[idx][0], time + arr[idx][1], arr);
            DFS(idx + 1, sum, time, arr);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
        }

        Main T = new Main();
        T.DFS(0, 0, 0, arr);
        System.out.print(answer);
    }
}
