import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class _02_08_등수구하기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] students = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sorted = students.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < cnt; i++) {
            map.put(sorted[i], cnt - i);
        }

        Arrays.stream(students).forEach(s -> System.out.print(map.get(s) + " "));
    }
}
