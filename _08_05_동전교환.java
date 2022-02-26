import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _08_05_동전교환 {

    private static int cnt, target;
    private static int[] coins;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());
        coins = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        target = Integer.parseInt(br.readLine());

        dfs(0, 0);
        System.out.println(min);

    }

    private static void dfs(int coinCnt, int sum) {
        if (coinCnt >= min)
            return;
        if (sum > target)
            return;
        if (sum == target) {
            min = Math.min(coinCnt, min);
        } else {
            for (int i = coins.length - 1; i >= 0; i--) {
                dfs(coinCnt + 1, sum + coins[i]);
            }
        }
    }
}
