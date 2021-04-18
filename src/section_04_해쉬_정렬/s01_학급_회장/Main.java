package section_04_해쉬_정렬.s01_학급_회장;

import java.util.*;

public class Main {

    public String solution(String str) {
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        String answer = "";
        for (char c : map.keySet()) {
            if (max < map.get(c)) {
                max = map.get(c);
                answer = String.valueOf(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}
