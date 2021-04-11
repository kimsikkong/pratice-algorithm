package section_02_배열.s08_등수_구하기;

import java.util.Scanner;

public class Main {

    public String solution(int n, int[] arr) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            int r = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (arr[i] < arr[j]) {
                    r++;
                }
            }
            answer += r + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Main T = new Main();
        System.out.println(T.solution(n, arr));
    }
}
