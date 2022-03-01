import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Stack;

public class _01_07_회문_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().toLowerCase().split("");

        // Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length / 2; ++i) {
            int j = input.length - 1 - i;
            if (!input[i].equals(input[j])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
