package section_01_문자열.s11_문자열_압축;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        s += " ";
        int p = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                p++;
            } else {
                answer += s.charAt(i);
                if (p != 1) {
                    answer += String.valueOf(p);
                }
                p = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
