package section_05_자료_구조.s04_후위식_연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c >= 48 && c <= 57) stack.push(Character.getNumericValue(c));
            else {
                int a = stack.pop();
                int b = stack.pop();
                int k;
                if (c == '+') k = b + a;
                else if (c == '-') k = b - a;
                else if (c == '*') k = b * a;
                else k = b / a;
                stack.push(k);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s));
    }
}
