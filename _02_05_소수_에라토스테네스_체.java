import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_05_소수_에라토스테네스_체 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i <= input; i++) {
            if(isPrime(i)) ans += 1;
        }
        System.out.println(ans);
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
