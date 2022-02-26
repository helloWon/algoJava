import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class _06_05_중복_확인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : numbers) {
            set.add(i);
        }

        if (set.size() == cnt)
            System.out.println("U");
        else
            System.out.println("D");
    }
}
