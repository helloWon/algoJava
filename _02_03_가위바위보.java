import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _02_03_가위바위보 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < cnt; i++) {
            rule(a[i], b[i]);
        }
    }

    private static void rule(int a, int b) {
        if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
            printWinner(1);
        } else if (a == b) {
            printWinner(0);
        } else {
            printWinner(-1);
        }
    }

    private static void printWinner(int winner) {
        if (winner < 0)
            System.out.println("B");
        else if (winner == 0)
            System.out.println("D");
        else
            System.out.println("A");
    }
}
