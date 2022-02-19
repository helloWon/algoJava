import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10_03_최대_부분_증가수열 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] dy = new int[cnt];
        dy[0] = 1;

        int ans = 0;
        for (int i = 1; i < cnt; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] < numbers[i] && dy[j] > max)
                    max = dy[j];
            }
            dy[i] = max + 1;
            ans = Math.max(ans, dy[i]);
        }
        System.out.println(ans);
    }
}
