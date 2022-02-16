import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _04_01_학급_회장 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String line = br.readLine();

        Map<String, Integer> map = new HashMap<>(); // Avoid Compile Error at JAVA 7
        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);
        map.put("D", 0);
        map.put("E", 0);

        for (int i = 0; i < cnt; i++) {
            String key = String.valueOf(line.charAt(i));
            int temp = map.get(key);
            map.put(key, temp + 1);
        }

        int maxValueInMap = (Collections.max(map.values()));
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }
}