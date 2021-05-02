package section_06_정렬_검색_알고리즘.s08_이분검색;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int fi = 0;
        int li = arr.length - 1;
        int idx = (fi + li) / 2;
        while (arr[idx] != k) {
            idx = (fi + li) / 2;
            if (arr[idx] > k) li = idx - 1;
            else if (arr[idx] < k) fi = idx + 1;
        }

        return ++idx;
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
