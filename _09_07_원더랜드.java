import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 최소 스패닝 트리
 */
public class _09_07_원더랜드 {

    private static int[] parent;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        List<Edge> arr = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            arr.add(new Edge(input[0], input[1], input[2]));
        }
        Collections.sort(arr);

        parent = new int[v + 1]; // parent 초기화
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }

        int ans = 0;
        for (Edge edge : arr) {
            if (get(edge.v1) != get(edge.v2)) {
                union(edge.v1, edge.v2);
                ans += edge.cost;
            }
        }
        System.out.println(ans);
    }

    private static void union(int a, int b) {
        a = get(a);
        b = get(b);

        if (b < a)
            parent[a] = b;
        else
            parent[b] = a;
    }

    private static int get(int a) {
        if (a == parent[a])
            return a;
        return parent[a] = get(parent[a]);
    }

}

class Edge implements Comparable<Edge> {

    int v1, v2, cost;

    public Edge(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost; // ascending
    }

}