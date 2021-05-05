package section_07_DFS_BFS.s04_피보나치_재귀;

import java.util.Scanner;

public class Main {

    public static int[] cache;

    public int DFS(int n) {
        if (cache[n - 1] != 0)
            return cache[n - 1];

        if (n == 1 || n == 2) {
            cache[n - 1] = 1;
            return cache[n - 1];
        }
        else {
            cache[n - 1] = DFS(n - 2) + DFS(n - 1);
            return cache[n - 1];
        }
    }

    public int solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main T = new Main();
        cache = new int[n];
        System.out.println(T.DFS(n));
//        System.out.println(T.solution(n));
    }
}
