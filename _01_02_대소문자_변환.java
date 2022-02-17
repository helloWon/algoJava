import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_02_대소문자_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String ans = "";

        for (int i = 0; i < input.length(); i++) {
            char old = input.charAt(i);
            if (65 <= old && old <= 90) {
                ans += Character.toLowerCase(old);
            } else {
                ans += Character.toUpperCase(old);
            }
        }
        System.out.println(ans);
    }
}
