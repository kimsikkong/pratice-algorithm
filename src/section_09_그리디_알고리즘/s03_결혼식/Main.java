package section_09_그리디_알고리즘.s03_결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static class Time implements Comparable<Time> {
        public int t;
        public String s;

        public Time(int t, String s) {
            this.t = t;
            this.s = s;
        }

        @Override
        public int compareTo(Time o) {
            if (this.t > o.t) return 1;
            else if (this.t == o.t) return this.s.compareTo(o.s);
            else return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = scanner.nextInt();
            times.add(new Time(s, "s"));
            int e = scanner.nextInt();
            times.add(new Time(e, "e"));
        }

        Main T = new Main();
        System.out.print(T.solution(n, times));
    }

    public int solution(int n, ArrayList<Time> times) {
        int answer = 0;
        int cnt = 0;
        Collections.sort(times);
        for (Time t : times) {
            if ("s".equals(t.s)) {
                cnt++;
                answer = Math.max(answer, cnt);
            } else {
                cnt--;
            }
        }

        return answer;
    }
}
