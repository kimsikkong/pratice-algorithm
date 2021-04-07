package section_01_문자열.s12_암호;

import java.util.Scanner;

public class Main {

    public String solution(int c, String s) {
        String answer = "";
        s = s.replace("#", "1");
        s = s.replace("*", "0");

        for (int i = 0; i < c; i++) {
            String a = s.substring(i * 7, i * 7 + 7);
            answer += String.valueOf((char) Integer.parseInt(a, 2));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(c, s));
    }
}
