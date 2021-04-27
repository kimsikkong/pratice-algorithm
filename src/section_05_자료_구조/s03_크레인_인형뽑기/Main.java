package section_05_자료_구조.s03_크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j][moves[i] - 1] != 0) {
                    if (!stack.isEmpty() && stack.lastElement() == arr[j][moves[i] - 1] ) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(arr[j][moves[i] - 1]);
                    arr[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(n ,arr, m, moves));
    }
}
