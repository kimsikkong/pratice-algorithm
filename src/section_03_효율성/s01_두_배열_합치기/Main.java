package section_03_효율성.s01_두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] a, int[] b) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        while (p1 < a.length && p2 < b.length) {
            if (a[p1] <= b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while (p1 < a.length) answer.add(a[p1++]);
        while (p2 < b.length) answer.add(b[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        Main T = new Main();
        for (int x : T.solution(a, b)) {
            System.out.print(x + " ");
        }
    }
}
