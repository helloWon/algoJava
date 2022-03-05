import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 노가다로 품, 다시 풀어보기
 */
public class _05_06_공주_구하기 {

    private static int[] princes;
    private static int totalCnt, k, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        totalCnt = input[0];
        k = input[1];

        princes = new int[totalCnt]; // [1,1,1,1,1,1..] 로 채우기
        for (int i = 0; i < totalCnt; ++i) {
            princes[i] = 1;
        }

        sum = totalCnt;
        int idx = 0;
        while (sum > 1) {
            int check = 0;
            while (check < k) { // 3이 되면 빠져나옴
                // Arrays.stream(princes).forEach(s -> System.out.print(s + " "));
                if (princes[idx] == 0) {
                    idx += 1;
                } else {
                    check += 1;
                    idx += 1;
                }
                if (idx >= totalCnt)
                    idx -= totalCnt;

                // System.out.println("idx = " + idx + " check = " + check);
            }

            // check이 3이 되었으면 prince 제거
            removePrince(idx - 1); // 해당 idx 값 0으로 만들기
        }

        for (int i = 0; i < princes.length; i++) {
            if (princes[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    private static void removePrince(int idx) {
        if (idx == -1)
            idx = totalCnt - 1;
        princes[idx] = 0;
        // System.out.println("removed prince = " + (idx));
        sum -= 1;
    }
}
