import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_02_괄호문자제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int flag = 0;
        String ans = "";
        for (int i = 0; i < input.length(); i++) {
            char item = input.charAt(i);
            if (item == '(') {
                flag += 1;
            } else if (item == ')') {
                flag -= 1;
                continue;
            }
            if (flag == 0) {
                ans += String.valueOf(item);
            }
        }
        System.out.println(ans);
    }
}
