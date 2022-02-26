import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _05_05_쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        int ans = 0;
        Stack<String> sticks = new Stack<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                sticks.push("(");
                continue;
            }
            if (input[i].equals(")")) {
                sticks.pop();
                if (input[i - 1].equals("(")) {
                    // System.out.println(sticks);
                    ans += sticks.size();
                } else {
                    // System.out.println(sticks);
                    ans += 1;
                }
            }
        }

        System.out.println(ans);
    }
}
