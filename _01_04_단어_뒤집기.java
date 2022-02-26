import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _01_04_단어_뒤집기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<String> input = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            input.add(br.readLine());
        }

        ArrayList<String> ans = new ArrayList<>();
        for (String string : input) {
            StringBuffer sb = new StringBuffer(string);
            String reversedStr = sb.reverse().toString();
            ans.add(reversedStr);
        }

        ans.forEach(System.out::println);
    }
}
