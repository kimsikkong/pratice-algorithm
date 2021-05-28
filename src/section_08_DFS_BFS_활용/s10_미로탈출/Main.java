package section_08_DFS_BFS_활용.s10_미로탈출;

import java.util.Scanner;

public class Main {

    public static final int WIDTH = 7;
    public static final int HEIGHT = 7;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[][] board = new int[WIDTH + 1][HEIGHT + 1];
    public static int answer = 0;

    public void DFS(int x, int y) {
        if (x == WIDTH && y == HEIGHT) {
            answer++;
        } else {
            for (int i = 0; i < dx.length; i++) {
                int a = x + dx[i];
                int b = y + dy[i];
                if (a == 0 || b == 0 || a == WIDTH + 1 || b == HEIGHT + 1) continue;
                if (board[a][b] == 0) {
                    board[x][y] = 2;
                    DFS(a, b);
                    board[x][y] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= WIDTH; i++) {
            for (int j = 1; j <= HEIGHT; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        Main T = new Main();
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.print(answer);
    }
}
