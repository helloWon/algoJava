import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _03_06_최대_길이_연속부분수열 {

    private static int cnt = 0, k = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        cnt = k;
        int lp = 0, rp = lp;
        int ans = 0;
        while (rp < n) {
            if (cnt == 0 && arr[rp] == 0) {
                ans = Math.max(ans, rp - lp);
                lp += 1;
                rp = lp;
                initCnt();
                continue;
            }

            if (arr[rp] == 0) {
                cnt -= 1;
                rp += 1;
            } else {
                rp += 1;
            }
        }
        System.out.println(ans);
    }

    private static void initCnt() {
        cnt = k;
    }
}
