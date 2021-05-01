package section_06_정렬_검색_알고리즘.s05_중복_확인;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        String answer = set.size() == n ? "U" : "D";
        System.out.println(answer);
    }
}
