package section_02_배열.s11_임시반장_정하기;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int max = 0;
        int pos = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                pos = i;
            }
        }

        return pos + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Main T = new Main();
        System.out.println(T.solution(n, arr));
    }
}
