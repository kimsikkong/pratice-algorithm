package section_03_효율성.s05_연속된_자연수의_합;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int lt = 1;
        int sum = 0;
        int cnt = 0;

        for (int rt = 1; rt <= (n / 2) + 1; rt++) {
            sum += rt;
            if (sum == n) {
                sum -= lt++;
                cnt++;
            } else if (sum > n) {
                while (sum > n) {
                    sum -= lt;
                    if (sum == n) cnt++;
                    lt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.solution(n));
    }
}
