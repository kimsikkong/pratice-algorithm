package section_01_문자열.s03_문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String string) {
        int max = 0;
        int pos = 0;
        String answer = "";

        while ((pos = string.indexOf(" ")) != -1) {
            String s = string.substring(0, pos);

            if (max < s.length()) {
                max = s.length();
                answer = s;
            }

            string = string.substring(pos+1);
        }

        if (max < string.length()) {
            answer = string;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        Main T = new Main();
        System.out.println(T.solution(string));
    }
}