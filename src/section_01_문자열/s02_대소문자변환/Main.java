package section_01_문자열.s02_대소문자변환;

import java.util.Scanner;

public class Main {

    public String solution(String a) {
        StringBuilder answer = new StringBuilder();

        for (char s : a.toCharArray()) {

            if (s >= 65 && s <= 90) {
                answer.append(Character.toChars(s + 32));
            } else {
                answer.append(Character.toChars(s - 32));
            }

//            if (Character.isUpperCase(s)) {
//                answer.append(Character.toLowerCase(s));
//            } else {
//                answer.append(Character.toUpperCase(s));
//            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        Main t = new Main();
        System.out.println(t.solution(input1));
    }
}
