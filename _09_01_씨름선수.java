import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _09_01_씨름선수 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            int[] hw = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            players.add(new Player(hw[0], hw[1]));
        }

        System.out.println(solve(players));

    }

    private static int solve(ArrayList<Player> players) {
        int ans = 0;
        int max = 0;

        Collections.sort(players);
        for (Player player : players) {
            // 키 내림차순, 몸무게 역대 최고치면 선수 선발됨
            if (player.weight > max) {
                max = player.weight;
                ans++;
            }
        }
        return ans;
    }
}

class Player implements Comparable<Player> {
    int height, weight;

    public Player(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Player o) {
        // 내림차순 정렬
        return o.height - this.height;
    }

}