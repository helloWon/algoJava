import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class _03_02_공통원소_구하기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        int[] arrA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Integer.parseInt(br.readLine());
        int[] arrB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : arrA) {
            map.put(i, 1);
        }
        for (int i : arrB) {
            if(map.get(i) != null){
                ans.add(i);
            }
        }
        Collections.sort(ans);
        ans.stream().forEach(s -> System.out.print(s + " "));
    }
}
