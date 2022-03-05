import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 냅색 알고리즘
 */
public class _10_05_동전교환 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] coins = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine());
        int[] dy = new int[target + 1];

        for (int i = 1; i <= target; i++) {
            dy[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = coins[i]; j <= target; j++) {
                if (coins[i] == j)
                    dy[j] = 1;
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }
        System.out.println(dy[target]);
    }
}
