import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_08_유효한_팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase();
        String[] arr = input.replaceAll("[^A-Za-z]*", "").split("");

        for (int i = 0; i < arr.length / 2; i++) {
            if(!arr[i].equals(arr[arr.length - 1- i])){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
