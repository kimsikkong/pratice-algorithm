package section_02_배열.s07_점수_계산;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int sum = 0;
        int k = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                sum += k;
                k++;
            } else {
                k = 1;
            }
        }

        return sum;
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
