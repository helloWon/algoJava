import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class _08_03_최대점수_구하기 {
    private static int max = 0;
    private static int totalTime = 0;
    private static List<int[]> problems = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        totalTime = Integer.parseInt(st.nextToken());

        for (int i = 0; i < cnt; i++) {
            problems.add(Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray());
        }

        dfs(0, 0, 0);
        System.out.println(max);
    }

    private static void dfs(int idx, int score, int sumTime) {
        if (sumTime > totalTime)
            return;

        if (idx == problems.size()) {
            max = Math.max(max, score);
        } else {
            dfs(idx + 1, score + problems.get(idx)[0], sumTime + problems.get(idx)[1]);
            dfs(idx + 1, score, sumTime);
        }
    }
}
