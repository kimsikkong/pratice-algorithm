package section_02_배열.s06_뒤집은_소수;

import java.util.Scanner;

public class Main {

    public String solution(int n, int[] arr) {
        int MAX = 100_000;
        int[] prime_numbers = new int[MAX + 1];
        prime_numbers[0] = 2;
        prime_numbers[1] = 2;

        for (int i = 2; i < MAX; i++) {
            if (prime_numbers[i] == 0 || prime_numbers[i] == 1) {
                for (int j = i; j <= MAX; j = j + i) {
                    prime_numbers[j] = ++prime_numbers[j];
                }
            }
        }

        String answer = "";
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
            if (prime_numbers[k] == 1) {
                answer += k + " ";
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
