import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 냅색 알고리즘
 */
public class _10_06_최대점수_구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int totalTime = Integer.parseInt(st.nextToken());

        int[] dy = new int[totalTime + 1];
        for (int i = 1; i <= totalTime; i++) {
            dy[i] = 0;
        }

        for (int i = 1; i <= cnt; ++i) {
            int[] input = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int score = input[0], time = input[1];

            for (int j = totalTime; j >= time; j--) {
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }
        System.out.println(dy[totalTime]);
    }
}