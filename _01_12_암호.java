import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class _01_12_암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");

        String word;
        int num;
        String ans = "";
        for (int i = 0; i < input.length; i+=7) {
            word = Arrays.stream(input).skip(i).limit(7).collect(Collectors.joining());
            word = word.replaceAll("#", "1").replaceAll("\\*", "0");
            num =  Integer.parseInt(word, 2);
            ans += (char) num;
        }
        System.out.println(ans);
    }
}
