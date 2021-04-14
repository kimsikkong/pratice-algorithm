package section_03_효율성.s02_공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        ArrayList<Integer> answer = new ArrayList<>();

        // 1 2 3 5 9
        // 2 3 5 7 8 11
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            else if (a[p1] < b[p2]) p1++;
            else p2++;
        }

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
