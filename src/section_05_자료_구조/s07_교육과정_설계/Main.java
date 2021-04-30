package section_05_자료_구조.s07_교육과정_설계;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public String solution(String s1, String s2) {
        LinkedList<Character> Q = new LinkedList<>();
        for (char c : s1.toCharArray()) Q.offer(c);
        for (char c : s2.toCharArray()) {
            if (Q.contains(c) && Q.indexOf(c) == 0) Q.poll();
        }

        return Q.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s1, s2));
    }
}
