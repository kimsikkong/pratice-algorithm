package section_08_DFS_BFS_활용.s13_섬나라_아일랜드;

import java.util.Scanner;

public class Main {

    public static int[][] board;
    public static int n;
    public static int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    public static int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};

    public void DFS(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < n && b >= 0 && b < n && board[a][b] == 1) {
                board[a][b] = 0;
                DFS(a, b);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;
        Main T = new Main();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    T.DFS(i, j);
                }
            }
        }

        System.out.print(answer);
    }
}
