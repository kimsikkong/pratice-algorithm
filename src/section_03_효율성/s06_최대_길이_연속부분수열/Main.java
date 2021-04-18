package section_03_효율성.s06_최대_길이_연속부분수열;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int lt = 0;
        int cnt = 0;
        int answer = 0;

        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            if (cnt > k ) {
               while (cnt > k) {
                   if (arr[lt] == 0) cnt--;
                   lt++;
               }
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
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
