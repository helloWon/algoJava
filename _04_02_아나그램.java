import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _04_02_아나그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();

        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            addMap(first, firstMap, i);
            addMap(second, secondMap, i);
        }

        if (firstMap.equals(secondMap))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static void addMap(String str, Map<Character, Integer> map, int idx) {
        char key = str.charAt(idx);
        if (map.get(key) != null) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
