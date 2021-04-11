package section_02_배열.s06_뒤집은_소수;

import java.util.Scanner;

public class Main {

    public boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String solution(int n, int[] arr) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            int res = 0;
            int temp = arr[i];

            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            if (isPrimeNumber(res)) {
                answer += res + " ";
            }

        }
        return answer.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Main T = new Main();
        System.out.println(T.solution(n ,arr));
    }
}
