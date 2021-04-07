package section_02_배열.s01_큰_수_출력하기;

import java.util.Scanner;

public class Main {

    public String solution(int i, int[] ints) {
        String answer = "";

        for (int j = 1; j < i + 1; j++) {
            if (ints[j] > ints[j-1]) {
                answer += ints[j] + " ";
            }
        }

        return answer.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] ints = new int[i + 1];
        ints[0] = 0;
        for (int j = 1; j < i + 1; j++) {
            ints[j] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(i, ints));
    }
}
