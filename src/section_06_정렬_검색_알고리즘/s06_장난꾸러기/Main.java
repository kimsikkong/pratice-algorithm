package section_06_정렬_검색_알고리즘.s06_장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) list.add(i + 1);
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
