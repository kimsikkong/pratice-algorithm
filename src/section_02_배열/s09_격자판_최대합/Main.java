package section_02_배열.s09_격자판_최대합;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            if (Math.max(rowSum, colSum) > max) {
                max = Math.max(rowSum, colSum);
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }

        if (sum > max) {
            max = sum;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Main T = new Main();
        System.out.println(T.solution(n, arr));

    }
}
