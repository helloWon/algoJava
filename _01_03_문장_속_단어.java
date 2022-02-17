import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_03_문장_속_단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int max = 0;
        String ans = "";
        for (String string : input) {
            if (string.length() > max) {
                ans = string;
                max = string.length();
            }
        }
        System.out.println(ans);
    }
}
