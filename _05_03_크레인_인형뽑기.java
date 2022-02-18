import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _05_03_크레인_인형뽑기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n_size = Integer.parseInt(br.readLine());
        int[][] box = new int[n_size][n_size];

        // 2차원 배열 채우기
        for (int i = 0; i < n_size; i++) {
            box[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        // 동작 읽기
        Integer.parseInt(br.readLine());
        int[] moves = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // 인형 뽑기
        int ans = 0;
        String basket = "";
        for (int move : moves) {
            for (int i = 0; i < n_size; i++) {
                if (box[i][move - 1] != 0) {
                    if (isPop(box, basket, move, i)) {
                        basket = removeLastChar(basket);
                        ans += 1;
                    } else {
                        basket += box[i][move - 1];
                    }
                    box[i][move - 1] = 0;
                    break;
                }
            }
        }

        System.out.println(ans * 2);
    }

    private static boolean isPop(int[][] box, String basket, int move, int i) {
        return basket.length() != 0 && basket.charAt(basket.length() - 1) == (char) box[i][move - 1] + '0';
    }

    private static String removeLastChar(String s) {
        return s.substring(0, s.length() - 1);
    }

}
