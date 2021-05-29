package section_08_DFS_BFS_활용.s11_미로의_최단거리_통로;

import java.util.Scanner;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[][] board = new int[8][8];
    public static int answer = Integer.MAX_VALUE;

    public void DFS(int x, int y, int distance) {
        if (x == 7 && y == 7) answer = Math.min(answer, distance);
        else {
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a >= 1 && a <= 7 && b >= 1 && b <= 7 && board[a][b] == 0) {
                    board[a][b] = 1;
                    DFS(a, b, distance + 1);
                    board[a][b] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        board[1][1] = 1;
        Main T = new Main();
        T.DFS(1, 1, 0);
        answer = answer == Integer.MAX_VALUE ? -1 : answer;
        System.out.print(answer);
    }
}
