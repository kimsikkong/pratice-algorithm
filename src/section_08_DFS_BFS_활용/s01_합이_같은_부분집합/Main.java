package section_08_DFS_BFS_활용.s01_합이_같은_부분집합;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int[] arr;
    public static int n;
    public static Map<Integer, Integer> chk;
    public static boolean match = false;

    public void DFS(int idx) {
        if (idx == n) {
            Set<Integer> keys = chk.keySet();
            int matchSum = 0;
            int unMatchSum = 0;
            for (int k : keys) {
                if (chk.get(k) == 1) matchSum += k;
                else unMatchSum += k;
            }

            if (!match) match = matchSum == unMatchSum;
        } else {
            chk.put(arr[idx], 1);
            DFS(idx + 1);
            chk.put(arr[idx], 0);
            DFS(idx  + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];
        chk = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            chk.put(arr[i], 0);
        }

        Main T = new Main();
        T.DFS(0);
        if (match) System.out.println("YES");
        else System.out.println("NO");
    }
}
