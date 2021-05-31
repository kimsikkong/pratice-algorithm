package section_08_DFS_BFS_활용.s14_피자_배달_거리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2 {

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int n;
    public static int m;
    public static List<Point> hs;
    public static List<Point> pz;
    public static int[] combi;
    public static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int idx) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) {
                int d = Integer.MAX_VALUE;
                for (int i = 0; i < combi.length; i++) {
                    Point p = pz.get(combi[i]);
                    d = Math.min(d, Math.abs(h.x - p.x) + Math.abs(h.y - p.y));
                }
                sum += d;
            }

            answer = Math.min(answer, sum);
        } else {
            for (int i = idx; i < pz.size(); i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = scanner.nextInt();
                if (x == 1) hs.add(new Point(i, j));
                if (x == 2) pz.add(new Point(i, j));
            }
        }

        combi = new int[m];
        Main_2 T = new Main_2();
        T.DFS(0, 0);
        System.out.print(answer);
    }
}
