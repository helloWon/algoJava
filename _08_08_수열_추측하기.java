import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _08_08_수열_추측하기 {

    private static int[][] dy = new int[34][34];
    private static int[] b, p, ch;
    private static int n, target;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        // 아 이거 너무 어려운데, 이항계수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = input[0];
        target = input[1];

        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i);
        }
        dfs(0, 0);
    }

    private static void dfs(int L, int sum) {
        if (flag)
            return;
        if (L == n) {
            if (sum == target) {
                for (int x : p) {
                    System.out.print(x + " ");
                    flag = true;
                }
            }
        } else {
            for (int i = 1; i <= n; ++i) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    dfs(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    private static int combi(int n, int r) {
        if (dy[n][r] != 0)
            return dy[n][r];
        if (n == r || r == 0)
            return 1;
        else {
            dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
            return dy[n][r];
        }
    }
}
