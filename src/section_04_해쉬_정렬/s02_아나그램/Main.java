package section_04_해쉬_정렬.s02_아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> mapA = new HashMap<>();

        for (char c : a.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        for (char c: b.toCharArray()) {
            if (!mapA.containsKey(c) || mapA.get(c) == 0) return "NO";
            else mapA.put(c, mapA.get(c) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        Main T = new Main();
        System.out.println(T.solution(a, b));
    }
}
