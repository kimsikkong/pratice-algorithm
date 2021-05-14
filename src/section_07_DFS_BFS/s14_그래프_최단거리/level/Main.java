package section_07_DFS_BFS.s14_그래프_최단거리.level;

import java.util.*;

public class Main {

    public static ArrayList<ArrayList<Integer>> graph;
    public static int n;
    public static int m;
    public static int[] chk;
    public static HashMap<Integer, Integer> answer = new HashMap<>();

    public void BFS() {
        chk[1] = 1;
        LinkedList<ArrayList<Integer>> Q = new LinkedList<>();
        Q.offer(graph.get(1));
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                ArrayList<Integer> c = Q.poll();
                for (int x : c) {
                    if (chk[x] != 1) {
                        chk[x] = 1;
                        Q.offer(graph.get(x));
                        answer.put(x, L + 1);
                    }
                }
            }

            L++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        chk = new int[n + 1];
        Main T = new Main();
        T.BFS();

        Set<Integer> keys = answer.keySet();
        for (int k : keys) {
            System.out.println(k + " : " + answer.get(k));
        }
    }
}
