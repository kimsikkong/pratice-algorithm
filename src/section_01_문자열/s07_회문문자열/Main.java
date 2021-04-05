package section_01_문자열.s07_회문문자열;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        s = s.toUpperCase();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
