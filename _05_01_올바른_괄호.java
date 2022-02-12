
import java.io.*;
import java.util.Stack;

public class _05_01_올바른_괄호 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                stack.push("(");
            } else {
                try {
                    stack.pop();
                } catch (Exception e) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
