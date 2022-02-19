import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class _09_03_결혼식 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> in = new HashMap<>();
        HashMap<Integer, Integer> out = new HashMap<>();
        for (int i = 0; i < cnt; i++) {
            int[] friend = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            in.merge(friend[0], 1, Integer::sum);
            out.merge(friend[1], 1, Integer::sum);
        }

        int max = 0;
        int cntFriends = 0;
        int threeDays = 72;
        for (int i = 0; i < threeDays; i++) {
            cntFriends += in.getOrDefault(i, 0);
            cntFriends -= out.getOrDefault(i, 0);
            max = Math.max(max, cntFriends);
        }
        System.out.println(max);
    }
}