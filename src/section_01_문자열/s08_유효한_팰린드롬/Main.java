package section_01_문자열.s08_유효한_팰린드롬;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "YES";
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!(chars[lt] >= 65 && chars[lt] <= 90)) {
                lt++;
                continue;
            }

            if (!(chars[rt] >= 65 && chars[rt] <= 90)) {
                rt--;
                continue;
            }

            if (chars[lt] != chars[rt]) {
                answer = "NO";
                break;
            }

            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
