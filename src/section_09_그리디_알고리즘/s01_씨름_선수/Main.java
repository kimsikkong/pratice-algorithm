package section_09_그리디_알고리즘.s01_씨름_선수;

import java.util.*;

public class Main {

    static class Person implements Comparable<Person> {
        public int h;
        public int w;

        public Person(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Person o) {
            return o.h - this.h;
        }
    }

    public static List<Person> persons = new ArrayList<>();

    public int solution(int n) {
        int answer = 0;
        Collections.sort(persons);
        int maxHeight = persons.get(0).w;
        for (Person p : persons) {
            if (p.w >= maxHeight) {
                maxHeight = p.w;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            persons.add(new Person(h, w));
        }

        Main T = new Main();
        System.out.print(T.solution(n));
    }
}
