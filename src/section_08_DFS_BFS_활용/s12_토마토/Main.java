package section_08_DFS_BFS_활용.s12_토마토;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int[][] store;
    public static int[][] days;
    public static int m;
    public static int n;
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static LinkedList<Point> Q;

    public boolean isCompleted() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (store[i][j] == 0) return false;
            }
        }

        return true;
    }

    public int BFS() {
        if (Q.size() == 0) return -1;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Point p = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int a = p.x + dx[j];
                    int b = p.y + dy[j];
                    if (a >= 0 && a < n && b >= 0 && b < m && store[a][b] == 0) {
                        store[a][b] = 1;
                        days[a][b] = days[p.x][p.y] + 1;
                        Q.offer(new Point(a, b));
                    }
                }
            }
        }

        if (!isCompleted()) return -1;
        else {
            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, days[i][j]);
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        store = new int[n][m];
        days = new int[n][m];
        Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                store[i][j] = scanner.nextInt();
                if (store[i][j] == 1) Q.offer(new Point(i, j));
            }
        }

        Main T = new Main();
        System.out.print(T.BFS());
    }
}
