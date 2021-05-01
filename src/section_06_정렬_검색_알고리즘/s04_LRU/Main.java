package section_06_정렬_검색_알고리즘.s04_LRU;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public void solution(int s, int n, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s; i++) {
            stack.push(0);
        }

        for (int i = 0; i < n; i++) {
            int idx = stack.indexOf(arr[i]);
            if (-1 != idx) stack.removeElementAt(idx);
            stack.push(arr[i]);
            if (stack.size() == s + 1) stack.removeElementAt(0);
        }

        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        T.solution(s, n, arr);
    }
}
