import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_05_연속된_자연수의_합 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int m = input / 2 + 1;
        int[] arr = new int[m];

        // 증가순열
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        int ans = 0, sum = 0, lt = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i];
            if (sum == input)
                ans += 1;
            while (sum >= input) {
                sum -= arr[lt++];
                if (sum == input)
                    ans += 1;
            }
        }
        System.out.println(ans);
    }
}
