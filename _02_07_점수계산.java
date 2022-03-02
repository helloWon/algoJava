import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _02_07_점수계산 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        int[] problems = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int score = 0;
        int tempScore = 0;
        for (int problem : problems) {
            if (problem == 1) {
                tempScore += 1;
                score += tempScore;
            } else {
                tempScore = 0;
            }
        }
        System.out.println(score);
    }
}
