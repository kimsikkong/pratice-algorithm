package section_06_정렬_검색_알고리즘.s10_마구간_정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int c, int[] arr) {
        int answer = -1;
        Arrays.sort(arr);
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int idx = 0;
            int cnt = 1;
            for (int i = 1; i < n; i++) {
                if (arr[idx] + mid <= arr[i]) {
                    cnt++;
                    idx = i;
                }
            }

            if (cnt >= c) {
                lt = mid + 1;
                answer = mid;
            } else rt = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(n, c, arr));
    }
}
