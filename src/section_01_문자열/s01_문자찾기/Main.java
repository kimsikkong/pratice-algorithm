package section_01_문자열.s01_문자찾기;

import java.util.Scanner;

public class Main {
    public int solution(String input, String input2) {

        String[] array = input.split("");
        int count = 0;

        for (String s : array) {
            if (s.equals(input2)) {
                count++;
            }
        }

        return count;
    }


    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        System.out.println(new Main().solution(input1.toLowerCase(), input2.toLowerCase()));
    }
}