package section_01_문자열.s11_문자열_압축;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        int p = 1;
        char temp = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == temp) {
                p++;
            } else {
                if (p == 1) {
                    answer += temp;
                } else {
                    answer += temp + String.valueOf(p);
                }
                p = 1;
            }

            if (i == s.length() - 1) {
                if (s.charAt(i) == temp) {
                    if (p == 1) {
                        answer += temp;
                    } else {
                        answer += temp + String.valueOf(p);
                    }
                } else {
                    if (p == 1) {
                        answer += s.charAt(i);
                    } else {
                        answer += s.charAt(i) + String.valueOf(p);
                    }
                }
            }

            temp = s.charAt(i);
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
