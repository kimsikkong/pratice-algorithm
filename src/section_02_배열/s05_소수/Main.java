package section_02_배열.s05_소수;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;

                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.solution(n));
    }
}
