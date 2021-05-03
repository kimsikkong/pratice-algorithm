package section_06_정렬_검색_알고리즘.s09_뮤직비디오;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = -1;
        int lt = Arrays.stream(arr).min().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int mid;
        while (lt <= rt) {
            mid = (lt + rt) / 2;
            int cnt = 1;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (sum + arr[i] > mid) {
                    cnt++;
                    sum = arr[i];
                } else sum += arr[i];
            }

            if (cnt > m) lt = mid + 1;
            else {
                answer = mid;
                rt = mid - 1;
            }
        }

        return answer;
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
