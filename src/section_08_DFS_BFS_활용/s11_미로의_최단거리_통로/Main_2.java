package section_08_DFS_BFS_활용.s11_미로의_최단거리_통로;

import java.util.LinkedList;
import java.util.Scanner;

public class Main_2 {

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] board = new int[8][8];
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public int BFS() {
        LinkedList<Point> Q = new LinkedList<>();
        Q.offer(new Point(1, 1));
        int L = 0;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    assert p != null;
                    int a = p.x + dx[j];
                    int b = p.y + dy[j];
                    if (a == 7 && b == 7) return L + 1;
                    if (a >= 1 && a <= 7 && b >= 1 && b <= 7 && board[a][b] == 0) {
                        board[a][b] = 1;
                        Q.offer(new Point(a, b));
                    }
                }
            }

            L++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        Main_2 T = new Main_2();
        System.out.print(T.BFS());
    }
}
