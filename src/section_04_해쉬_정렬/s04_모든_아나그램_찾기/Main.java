package section_04_해쉬_정렬.s04_모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        for (char c : t.toCharArray()) {
            am.put(c, am.getOrDefault(c, 0) + 1);
        }

        char[] arr = s.toCharArray();
        HashMap<Character, Integer> bm = new HashMap<>();
        for (int i = 0; i < t.length() - 1; i++) {
            bm.put(arr[i], bm.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < arr.length; rt++) {
            bm.put(arr[rt], bm.getOrDefault(arr[rt], 0) + 1);
            if (bm.equals(am)) answer++;
            bm.put(arr[lt], bm.get(arr[lt]) - 1);
            if (bm.get(arr[lt]) == 0) bm.remove(arr[lt]);
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        Main T = new Main();
        System.out.println(T.solution(s, t));
    }

}
