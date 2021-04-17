package section_03_효율성.s03_최대_매출;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
             arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(n, k, arr));
    }
}
