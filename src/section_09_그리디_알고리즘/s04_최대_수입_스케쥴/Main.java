package section_09_그리디_알고리즘.s04_최대_수입_스케쥴;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Lecture implements Comparable<Lecture> {
        public int money;
        public int date;

        public Lecture(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.date - this.date;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Lecture> lectures = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int d = scanner.nextInt();
            lectures.add(new Lecture(m, d));
            max = Math.max(max, d);
        }

        Main T = new Main();
        System.out.print(T.solution(max, lectures));
    }

    public int solution(int max, ArrayList<Lecture> lectures) {
        int answer = 0;
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(lectures);
        int j = 0;
        for (int i = max; i >0; i--) {
            while (true) {
                if (j < lectures.size() && i == lectures.get(j).date) {
                    PQ.offer(lectures.get(j).money);
                    j++;
                }
                else break;
            }

            if (!PQ.isEmpty()) answer += PQ.poll();
        }

        return answer;
    }
}
