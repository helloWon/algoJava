import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _04_04_모든_아나그램_찾기 {

    private static Map<String, Integer> target = new HashMap<>();
    private static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        String[] t = br.readLine().split("");

        int windowSize = t.length;

        // 첫 window 채우기
        Map<String, Integer> window = new HashMap<>();
        for (int i = 0; i < windowSize; i++) {
            window.merge(s[i], 1, Integer::sum);
            target.merge(t[i], 1, Integer::sum);
        }

        compareMaps(window);
        removePastVal(window, s[0]);

        // window 돌리기
        for (int i = windowSize; i < s.length; i++) {
            window.merge(s[i], 1, Integer::sum);
            compareMaps(window);
            removePastVal(window, s[i - windowSize + 1]);
        }
        System.out.println(ans);
    }

    private static void compareMaps(Map<String, Integer> window) {
        if (window.equals(target))
            ans += 1;
    }

    private static void removePastVal(Map<String, Integer> window, String key) {
        window.put(key, window.get(key) - 1);
        if (window.get(key) == 0) {
            window.remove(key);
        }
    }
}
