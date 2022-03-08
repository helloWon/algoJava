import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_12_암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");

        String word = "";
        int num;
        String ans = "";
        for (int i = 0; i < input.length; ++i) {
            switch (input[i]) {
                case "#":
                    word += "1";
                    break;
                case "*":
                    word += "0";
                    break;
            }
            if (word.length() == 7) {
                num = Integer.parseInt(word, 2);
                ans += (char) num;
                word = "";  // word 초기화
            }
        }
        System.out.println(ans);
    }
}
