package section_02_배열.s02_보이는_학생;

import java.util.Scanner;

public class Main {

    public String solution(int c, int[] array) {
        int cnt = 1;
        int h = array[0];

        for (int i = 1; i < c; i++) {
            if ((array[i - 1] < array[i]) && array[i] > h) {
                h = array[i];
                cnt++;
            }
        }

        return String.valueOf(cnt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int[] array = new int[c];
        for (int i = 0; i < c; i++) {
            array[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(c, array));
    }
}
