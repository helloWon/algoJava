import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _06_06_장난꾸러기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] students = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] right = students.clone(); // deep copy
        Arrays.sort(right);

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            if (right[i] != students[i])
                ans.add(i + 1); // 1번부터
        }

        Collections.sort(ans);
        ans.forEach(s -> System.out.print(s + " "));

    }
}
