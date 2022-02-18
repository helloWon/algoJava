import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _03_03_최대_매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] days = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        for (int i = 0; i < n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += days[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
