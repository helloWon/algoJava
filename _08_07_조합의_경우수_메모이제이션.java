import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _08_07_조합의_경우수_메모이제이션 {

    private static int[][] dy = new int[34][34];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = dfs1(input[0], input[1]);
        System.out.println(ans);
    }

    private static int dfs1(int n, int r) {
        if (dy[n][r] != 0)
            return dy[n][r];
        if (n == r || r == 0)
            return 1;
        else {
            dy[n][r] = dfs1(n - 1, r - 1) + dfs1(n - 1, r);
            return dy[n][r];
        }
    }

    private static int dfs0(int n, int r) { // 시간초과
        if (n == r || r == 0)
            return 1;
        else
            return dfs0(n - 1, r - 1) + dfs0(n - 1, r);
    }
}
