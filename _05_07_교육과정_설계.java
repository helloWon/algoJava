import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _05_07_교육과정_설계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String essentials = br.readLine();
        String[] classes = br.readLine().split("");

        HashMap<String, Integer> map = new HashMap<>();
        for (String essential : essentials.split("")) {
            map.put(essential, 1);
        }

        String ans = "";
        for (String _class : classes) {
            if(map.get(_class) != null) ans += _class; 
        }
        
        if(ans.equals(essentials)) System.out.println("YES");
        else System.out.println("NO");
    }
}
