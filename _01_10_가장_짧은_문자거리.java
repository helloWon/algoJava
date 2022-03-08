import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class _01_10_가장_짧은_문자거리 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        String arr = input[0];
        char target = input[1].charAt(0);

        // to right
        int[] ans = new int[arr.length()];
        int p = 101;
        for (int i = 0; i < arr.length(); ++i) {
            if (arr.charAt(i) == target) {
                p = 0;
            } else {
                ++p;
            }
            ans[i] = p;
        }

        // to left
        p = 101;
        for (int i = arr.length() - 1; i >= 0; --i) {
            if (arr.charAt(i) == target) {
                p = 0;
            } else {
                ++p;
            }
            ans[i] = Math.min(ans[i], p);
        }
        Arrays.stream(ans).forEach(s -> System.out.print(s + " "));
    }

    // Time: 315ms, Mem: 32MB
    public static void solution_not_good(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        String[] arr = input[0].split("");
        String target = input[1];

        // e 의 index 값 저장
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                index.add(i);
            }
        }

        int right, rightIdx, left = index.get(0);
        if (index.size() > 1) {
            right = index.get(1);
            rightIdx = 1;
        } else {
            right = 101;
            rightIdx = -1;
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            if (right <= i) {
                left = right;
                right = (index.size() > rightIdx + 1) ? index.get(++rightIdx) : 101;
            }
            ans[i] = Math.min(Math.abs(left - i), Math.abs(right - i));

        }
        Arrays.stream(ans).forEach(s -> System.out.print(s + " "));
    }
}
