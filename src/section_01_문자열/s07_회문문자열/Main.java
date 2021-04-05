package section_01_문자열.s07_회문문자열;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String str1 = s.substring(0, s.length() / 2);
        String str2;

        if (s.length() % 2 == 0) {
            str2 = s.substring(s.length() / 2);
        } else {
            str2 = s.substring(s.length() / 2 + 1);
        }

        char[] chars = str2.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            char temp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = temp;
            lt++;
            rt--;
        }

        return str1.equalsIgnoreCase(String.valueOf(chars)) ? "YES" : "NO";
//        return str1.equalsIgnoreCase(new StringBuilder(str2).reverse().toString()) ? "YES" : "NO";
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
