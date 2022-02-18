import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
// import java.util.Set;
// import java.util.stream.Collectors;

public class _04_03_매출액의_종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] sales = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // k개만큼 먼저 넣어 window 만들기
        for (int i = 0; i < k; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
        }
        ans.add(map.size());

        // window 옮기기
        for (int i = k; i < n; i++) {
            // window left 빼기
            if (map.get(sales[i - k]) - 1 == 0) {
                map.remove(sales[i - k]);
            } else {
                map.put(sales[i - k], map.get(sales[i - k]) - 1);
            }

            // window right 더하기
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);

            // hashmap size
            ans.add(map.size());

            // hashset으로 하려다 실패
            // int[] range = Arrays.copyOfRange(sales, i, i + k);
            // Set<Integer> set = Arrays.stream(range).boxed().collect(Collectors.toSet());
            // ans.add(set.size());

        }

        ans.stream().forEach(s -> System.out.print(s + " "));
    }
}