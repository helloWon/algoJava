import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_09_숫자만_추출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        String result = input.replaceAll("[^0-9]*", "");
        int ans = Integer.parseInt(result);
        System.out.println(ans);
    }
}
