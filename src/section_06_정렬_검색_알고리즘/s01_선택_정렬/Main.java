package section_06_정렬_검색_알고리즘.s01_선택_정렬;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) idx = j;
            }

            if (idx != i) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}