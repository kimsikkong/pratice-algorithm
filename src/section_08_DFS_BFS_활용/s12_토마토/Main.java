package section_08_DFS_BFS_활용.s12_토마토;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] store;
    public static int m;
    public static int n;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public boolean isCompleted() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (store[i][j] == 0) return false;
            }
        }

        return true;
    }

    public int BFS() {
        LinkedList<Point> Q = new LinkedList<>();
        if (isCompleted()) return 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (store[i][j] == 1) Q.offer(new Point(i, j));
            }
        }

        if (Q.size() == 0) return -1;
        int L = 0;
        while (!Q.isEmpty() && !isCompleted()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int a = p.x + dx[j];
                    int b = p.y + dy[j];
                    if (a >= 0 && a < n && b >= 0 && b < m && store[a][b] == 0) {
                        store[a][b] = 1;
                        Q.offer(new Point(a, b));
                    }
                }
            }

            L++;
        }

        if (!isCompleted()) return -1;

        return L;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        store = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                store[i][j] = scanner.nextInt();
            }
        }

        Main T = new Main();
        System.out.print(T.BFS());
    }
}
