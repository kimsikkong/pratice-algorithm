package section_09_그리디_알고리즘.s02_회의실_배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static class Meeting implements Comparable<Meeting> {
        public int s;
        public int e;

        public Meeting(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Meeting o) {
            if (this.e > o.e) return 1;
            else if (this.e == o.e) return this.s - o.s;
            else return -1;
        }
    }

    public int solution(int n, ArrayList<Meeting> meetings) {
        Collections.sort(meetings);
        int answer = 1;
        int e = meetings.get(0).e;
        for (int i = 1; i < n; i++) {
            Meeting m = meetings.get(i);
            if (m.s >= e) {
                e = m.e;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            meetings.add(new Meeting(s, e));
        }

        Main T = new Main();
        System.out.print(T.solution(n, meetings));
    }

}
