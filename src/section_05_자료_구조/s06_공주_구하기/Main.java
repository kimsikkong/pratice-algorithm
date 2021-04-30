package section_05_자료_구조.s06_공주_구하기;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public int solution(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            int i = queue.poll();
            cnt++;
            if (cnt == k) cnt = 0;
            else queue.offer(i);

        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.solution(n, k));
    }
}
