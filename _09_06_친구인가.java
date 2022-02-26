import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _09_06_친구인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cntStudent = Integer.parseInt(st.nextToken());
        int cntMap = Integer.parseInt(st.nextToken());
        int arr[] = new int[cntStudent];

        for (int i = 0; i < arr.length; i++) {
            // 최초의 정점은 자기 자신이 부모 정점이 된다.
            arr[i] = i;
        }

        for (int i = 0; i < cntMap; i++) {
            int[] nodes = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            unionParent(arr, nodes[0] - 1, nodes[1] - 1);
        }

        int[] target = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        findParent(arr, target[0] - 1, target[1] - 1);

    }

    private static void unionParent(int[] arr, int a, int b) {
        a = getParent(arr, a);
        b = getParent(arr, b);

        if (a < b)
            arr[b] = a;
        else
            arr[a] = b;
    }

    private static int getParent(int[] arr, int x) {
        if (arr[x] == x)
            return x;
        return arr[x] = getParent(arr, arr[x]);
    }

    private static void findParent(int[] arr, int a, int b) {
        a = getParent(arr, a);
        b = getParent(arr, b);

        if (a == b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}