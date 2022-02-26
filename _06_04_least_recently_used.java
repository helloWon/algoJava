import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _06_04_least_recently_used {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int memorySize = Integer.parseInt(st.nextToken());
        int taskSize = Integer.parseInt(st.nextToken());
        int[] tasks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = taskSize - 1; i >= 0; i--) {
            if (ans.indexOf(tasks[i]) == -1) {
                ans.add(tasks[i]);
            }
        }
        while (ans.size() < taskSize) {
            ans.add(0);
        }

        ans.stream().limit(memorySize).forEach(s -> System.out.print(s + " "));
    }
}
