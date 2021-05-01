package section_05_자료_구조.s08_응급실;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    class Person {
        public int idx;
        public int priority;

        public Person(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        LinkedList<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while (true) {
            Person tmp = Q.poll();
            for (Person p : Q) {
                if (tmp.priority < p.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }

            if (null != tmp) {
                answer++;
                if (tmp.idx == m) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Main T = new Main();
        System.out.println(T.solution(n, m, arr));
    }

}
