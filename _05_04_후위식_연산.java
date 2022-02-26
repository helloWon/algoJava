import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _05_04_후위식_연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        Stack<Integer> nums = new Stack<>();
        for (String str : input) {
            if (isNumber(str)) {
                nums.push(Integer.parseInt(str));
            } else {
                int sec = nums.pop();
                int first = nums.pop();
                nums.push(calculator(first, sec, str));
            }
        }
        System.out.println(nums.pop());
    }

    private static int calculator(int first, int second, String cal) {
        if (cal.equals("+"))
            return first + second;
        else if (cal.equals("-"))
            return first - second;
        else if (cal.equals("*"))
            return first * second;
        else
            return first / second;
    }

    private static boolean isNumber(String item) {
        return item.matches("[0-9]+[\\.]?[0-9]*");
    }
}
