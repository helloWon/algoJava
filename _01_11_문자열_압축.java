import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_11_문자열_압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine() + "@";

        int cnt = 0;
        char temp = ' '; 
        String ans = "";
        for (int i = 0; i < input.length(); ++i) {
            char val = input.charAt(i);
            if (val == temp)
                cnt += 1;
            else {
                switch (cnt) {
                    case 0:
                        break;
                    case 1:
                        ans += Character.toString(temp);
                        break;
                    default:
                        ans += Character.toString(temp) + cnt;
                        break;
                }
                temp = val;
                cnt = 1;
            }
        }
        System.out.println(ans);
    }
}
