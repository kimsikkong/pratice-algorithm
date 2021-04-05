package section_01_문자열.s05_특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        char[] chars = s.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isLetter(chars[lt])) {
                lt++;
            } else if (!Character.isLetter(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
