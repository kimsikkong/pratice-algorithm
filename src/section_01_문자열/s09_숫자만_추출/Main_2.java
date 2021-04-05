package section_01_문자열.s09_숫자만_추출;

import java.util.Scanner;

public class Main_2 {

    public Integer solution(String s) {
        char[] chars = s.toCharArray();
        String answer = "";

        for (char c : chars) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.valueOf(answer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main_2 T = new Main_2();
        System.out.println(T.solution(s));
    }
}
