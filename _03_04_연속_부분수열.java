import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _03_04_연속_부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int ans = 0;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];

            if (sum == m) {
                ans += 1;
                sum -= numbers[j];
                j++;
            }
            while (sum >= m) {
                sum -= numbers[j++];
                if (sum == m) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
