package section_01_문자열.s04_단어뒤집기;

import java.util.Scanner;

public class Main {

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s = strings[i];
            char[] chars = s.toCharArray();

            int lt = 0;
            int rt = s.length() - 1;

            while (lt < rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }

            answer[i] = String.valueOf(chars);
        }

        return answer;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        Main T = new Main();
        String[] answers = T.solution(strings, n);
        for (String a : answers) {
            System.out.println(a);
        }
    }
}
