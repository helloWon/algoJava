import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _01_06_중복문자제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        Map<String, Integer> store = new HashMap<>();
        String ans = "";
        for (String character : input) {
            if (!store.containsKey(character)) {
                store.merge(character, 1, Integer::sum);
                ans += character;
            }
        }
        System.out.println(ans);
    }
}
