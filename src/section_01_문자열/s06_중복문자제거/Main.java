package section_01_문자열.s06_중복문자제거;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }

    //    public String solution(String s) {
//        char[] chars = s.toCharArray();
//        char[] answer = new char[chars.length];
//
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (chars[i] == answer[j]) {
//                    break;
//                }
//
//                if (i == j) {
//                    answer[j] = chars[i];
//                }
//            }
//        }
//
//        return String.valueOf(answer);
//    }
}
