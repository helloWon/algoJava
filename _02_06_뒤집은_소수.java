import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _02_06_뒤집은_소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("\\s+");

        ArrayList<Integer> ans = new ArrayList<>();
        for (String num : nums) {
            if (isPrime(reverseInt(num))) {
                ans.add(reverseInt(num));
            }
        }
        ans.forEach(s -> System.out.print(s + " "));

    }

    private static int reverseInt(String s) {
        return Integer.valueOf((new StringBuffer(s)).reverse().toString());
    }

    private static boolean isPrime(int a) {
        if (a < 2)
            return false;

        int num = (int) Math.sqrt(a);
        for (int i = 2; i <= num; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}