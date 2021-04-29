package section_05_자료_구조.s05_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(s.charAt(i));
            else {
                stack.pop();
                if (s.charAt(i - 1) == '(') answer += stack.size();
                else answer += 1;
            }
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
