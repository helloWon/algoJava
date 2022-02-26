import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _01_05_특정_문자_뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Map<Integer, Character> map = new HashMap<>();
        Stack<Character> alphaStack = new Stack<>();
        String ans = "";

        for (int i = 0; i < input.length(); i++) {
            if (isAlpha(input.charAt(i))) {
                alphaStack.push(input.charAt(i));
            } else {
                map.put(i, input.charAt(i));
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(i)) {
                ans += String.valueOf(map.get(i));
            } else {
                ans += String.valueOf(alphaStack.pop());
            }
        }

        System.out.println(ans);
    }

    private static boolean isAlpha(char character) {
        if (65 <= character && character <= 90 || 97 <= character && character <= 122) {
            return true;
        } else {
            return false;
        }
    }
}

// kdj#@kdjg%$#kdjgk@kd$dk
// kdd#@kkgj%$#dkgjd@kj$dk
// 다음부터는 isAlpha 만들어서 사용하지 말고 Character.isAlphabetic() 내장함수 사용하자
