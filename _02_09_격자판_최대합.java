import java.util.Scanner;

public class _02_09_격자판_최대합 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        int line = 0, reline = 0, max = 0;

        for (int i = 0; i < size; i++) {
            int row = 0, col = 0;
            for (int j = 0; j < size; j++) {
                row += arr[i][j];
                col += arr[j][i];
                if (i == j) {
                    line += arr[i][j];
                }
                if (i + j == size - 1) {
                    reline += arr[i][j];
                }
            }
            max = Math.max(max, col);
            max = Math.max(max, row);
        }

        max = Math.max(max, line);
        max = Math.max(max, reline);

        System.out.println(max);
    }
}
