package section_02_배열.s12_멘토링;

import java.util.Scanner;

public class Main {

    public int findIdx(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public int solution(int N, int M, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                int i1 = arr[0][i];
                int i2 = arr[0][j];
                boolean match = true;

                for (int k = 1; k < M; k++) {
                    if (findIdx(arr[k], i1) > findIdx(arr[k], i2)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Main T = new Main();
        System.out.println(T.solution(N, M, arr));
    }
}
