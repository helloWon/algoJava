import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class _08_01_합이_같은_부분집합 {

    private static boolean flag = false;
    private static int totalSum = 0;
    private static int cnt = 0;
    private static String ans = "NO";

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        totalSum = IntStream.of(arr).sum();

        dfs(0, 0, arr);
        System.out.println(ans);
    }

    private static void dfs(int idx, int sum, int[] arr) {
        // dfs break 용도
        if (flag) return;
        // 이미 totalSum의 절반보다 크므로 정답은 글렀음
        if (sum > totalSum / 2) return;

        if (idx == cnt) {
            // 각 원소를 포함하는 경우, 포함하지 않는 경우 했을 때 값이 딱 절반임
            if (sum == totalSum - sum){
                ans = "YES";
                flag = true;
            }

        } else {
            // 포함하는 경우, 포함하지 않는 경우
            dfs(idx +1, sum+arr[idx], arr);
            dfs(idx +1, sum, arr);
        }
    }
}