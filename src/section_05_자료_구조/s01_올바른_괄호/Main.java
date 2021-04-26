package section_05_자료_구조.s01_올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
