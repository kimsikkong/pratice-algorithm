package section_03_효율성.s04_연속_부분수열;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int sum = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if (sum == m) {
                sum -= arr[lt];
                cnt++;
                lt++;
            } else if (sum > m) {
                while (sum > m) {
                    sum -= arr[lt++];
                    if (sum == m) cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(n, m, arr));
    }
}
