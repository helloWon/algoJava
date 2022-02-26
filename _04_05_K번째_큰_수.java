import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class _04_05_K번째_큰_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // int[] sortedNum = Arrays.stream(num).boxed()
        // .sorted(Collections.reverseOrder())
        // .mapToInt(Integer::intValue)
        // .toArray();

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(num[i] + num[j] + num[l]);
                }
            }
        }

        int ans = -1;
        int cnt = 0;
        for (int sum : set) {
            cnt++;
            if (cnt == target) {
                ans = sum;
                break;
            }
        }
        System.out.println(ans);
    }
}
