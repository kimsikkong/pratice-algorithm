package section_06_정렬_검색_알고리즘.s06_장난꾸러기;

import java.util.Scanner;

public class Main {

    public void solution(int n, int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                a = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == arr[i]) a = j;
                    else break;
                }
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            if (i != a + 1 && arr[i] < arr[i - 1]) b = i;
        }

        if (b == 0) b = a + 1;

        System.out.println((a + 1) + " " + (b + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        T.solution(n, arr);
    }
}
