package section_06_정렬_검색_알고리즘.s07_좌표_정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x < o.x) return -1;
        else if (this.x == o.x) return this.y - o.y;
        else return 1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            points.add(new Point(a, b));
        }

        Collections.sort(points);
        for (Point p : points) {
            System.out.println(p.x + " " + p.y);
        }
    }
}
