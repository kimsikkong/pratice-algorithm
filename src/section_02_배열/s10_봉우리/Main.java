package section_02_배열.s10_봉우리;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int colMax = Math.max(arr[i][j - 1], arr[i][j + 1]);
                int rowMax = Math.max(arr[i - 1][j], arr[i + 1][j]);
                if (arr[i][j] > Math.max(colMax, rowMax)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n + 2][n + 2];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Main T = new Main();
        System.out.println(T.solution(n, arr));
    }
}
