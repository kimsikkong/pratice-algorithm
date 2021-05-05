package section_07_DFS_BFS.s01_재귀함수;

import java.util.Scanner;

public class Main {

    public void print(int n, int k) {
        System.out.print(k + " ");
        if (k == n) return;
        print(n, k + 1);
    }

    public void solution(int n) {
        print(n, 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main T = new Main();
        T.solution(n);
    }
}
