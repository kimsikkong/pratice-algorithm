package section_01_문자열.s10_가장_짧은_문자거리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(String s, char t) {
        int[] temp = new int[s.length()];
        char[] chars = s.toCharArray();
        int p = 100;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t) {
                p = 0;
            } else {
                p++;
            }
            temp[i] = p;
        }

        p = temp[chars.length - 1];

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == t) {
                p = 0;
            } else {
                p++;
            }

            if (temp[i] > p) {
                temp[i] = p;
            }
        }

        return Arrays.toString(temp).replaceAll("[^0-9 ]","");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);
        Main T = new Main();
        System.out.println(T.solution(s, t));
    }
}
