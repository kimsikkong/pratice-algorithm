package section_06_정렬_검색_알고리즘.s03_삽입_정렬;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
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
