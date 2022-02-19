import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_02_돌다리_건너기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine());

        int[] arr = new int[stairs];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;

        for (int i = 3; i < stairs; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println(arr[stairs - 1]);
    }
}
