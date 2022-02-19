import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _08_02_바둑이_승차 {

    private static int max = 0;
    private static int total = 0;
    private static List<Integer> dogs = new ArrayList<>();

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        total = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < cnt; i++) {
            dogs.add(Integer.parseInt(br.readLine()));
        }

        dfs(0, 0);
        System.out.println(max);
    }

    private static void dfs(int idx, int sum) {
        if (sum >= total)
            return;
        if (idx == dogs.size()) {
            if (sum > max)
                max = sum;
        } else {
            dfs(idx + 1, sum + dogs.get(idx));
            dfs(idx + 1, sum);
        }
    }
}
