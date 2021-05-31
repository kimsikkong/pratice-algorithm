package section_08_DFS_BFS_활용.s14_피자_배달_거리;

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

    public static int n;
    public static int m;
    public static int sum;
    public static int[][] arr;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int answer = Integer.MAX_VALUE;

    public int calculate(int x, int y) {
        LinkedList<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        int L = 0;
        while (!Q.isEmpty()) {
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                Point p = Q.poll();
                if (arr[p.x][p.y] == 2) {
                    return L;
                }
                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (nx > 0 && nx <= n && ny > 0 && ny <= n) {
                        if (arr[nx][ny] == 2) return L + 1;
                        Q.offer(new Point(nx, ny));
                    }
                }
            }

            L++;
        }

        return L;
    }

    public void calculateDistance() {
        int distanceSum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (arr[i][j] == 1) {
                    distanceSum += calculate(i, j);
                    if (distanceSum >= answer) return;
                }
            }
        }

        answer = Math.min(distanceSum, answer);
    }

    public void DFS(int cnt) {
        if (cnt == sum - m) {
            calculateDistance();
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (arr[i][j] == 2) {
                        arr[i][j] = 0;
                        DFS(cnt + 1);
                        arr[i][j] = 2;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 2) sum++;
            }
        }

        Main T = new Main();
        T.DFS(0);
        System.out.print(answer);
    }

}
