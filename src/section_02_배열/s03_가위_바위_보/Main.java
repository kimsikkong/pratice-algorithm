package section_02_배열.s03_가위_바위_보;

import java.util.Scanner;

public class Main {

    public void solution(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.println("D");
            } else if (a[i] > b[i]) {
                if (a[i] == 3 && b[i] == 1) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            } else if (b[i] > a[i]) {
                if (b[i] == 3 && a[i] == 1) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int[] a = new int[c];
        int[] b = new int[c];

        for (int i = 0; i < c; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < c; i++) {
            b[i] = scanner.nextInt();
        }

        Main T = new Main();
        T.solution(a, b);
    }
}
