package section_09_그리디_알고리즘.s05_다익스트라_알고리즘;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static class Edge implements Comparable<Edge> {

        public int vtx;
        public int cost;

        public Edge(int vtx, int cost) {
            this.vtx = vtx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }

    public static int[] dis;
    public static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

    public void solution() {
        PriorityQueue<Edge> PQ = new PriorityQueue<>();
        PQ.offer(new Edge(1, 0));
        while (!PQ.isEmpty()) {
            Edge edge = PQ.poll();
            int currentCost = edge.cost;
            int currentVtx = edge.vtx;
            if (dis[currentVtx] < currentCost) continue;

            for (Edge nextEdge : graph.get(currentVtx)) {
                int nextCost = currentCost + nextEdge.cost;
                if (dis[nextEdge.vtx] > nextCost) {
                    dis[nextEdge.vtx] = nextCost;
                    PQ.offer(new Edge(nextEdge.vtx, nextCost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int nx = scanner.nextInt();
            int c = scanner.nextInt();
            graph.get(x).add(new Edge(nx, c));
        }

        Main T = new Main();
        T.solution();
        for (int i = 2; i <= n; i++) {
            if (dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + ":Impossible");
            } else {
                System.out.println(i + ":" + dis[i]);
            }
        }
    }

}
