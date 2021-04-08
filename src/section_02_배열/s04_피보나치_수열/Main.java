package section_02_배열.s04_피보나치_수열;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String solution(int a) {
        int[] arr = new int[a];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < a; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        return Arrays.toString(arr).replaceAll("[^0-9 ]","");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Main T = new Main();
        System.out.println(T.solution(a));
    }
}
