import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _02_04_피보나치_수열 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);

        for (int i = 2; i < cnt; i++) {
            arr.add(arr.get(i-2) + arr.get(i-1));
        }

        arr.forEach(s -> System.out.print(s + " "));
    }
}
