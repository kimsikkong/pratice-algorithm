package section_01_문자열.s09_숫자만_추출;

import java.util.Scanner;

public class Main {

    public Integer solution(String s) {
        String s1 = s.replaceAll("\\D", "");
        return Integer.valueOf(s1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
