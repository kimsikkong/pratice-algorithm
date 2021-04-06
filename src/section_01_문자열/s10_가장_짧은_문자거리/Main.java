package section_01_문자열.s10_가장_짧은_문자거리;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String solution(String s, char t) {
        String answer = "";
        char[] chars = s.toCharArray();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t) {
                integers.add(i);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int c : integers) {
                int d = Math.abs(i - c);
                if (d < min) {
                    min = d;
                }
            }
            answer += min + " ";
        }

        return answer.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char t = scanner.next().charAt(0);
        Main T = new Main();
        System.out.println(T.solution(s, t));
    }
}
