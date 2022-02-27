import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _10_04_가장_높은_탑_쌓기 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] dy = new int[cnt];

        ArrayList<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int[] num = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            bricks.add(new Brick(num[0], num[1], num[2]));
        }

        Collections.sort(bricks);
        dy[0] = bricks.get(0).h;
        int ans = dy[0]; // 넓이가 가장 작은게 처음에 올때 그때 h로 초기화
        for (int i = 1; i < bricks.size(); i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(j).w > bricks.get(i).w && dy[j] > max_h) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + bricks.get(i).h;
            ans = Math.max(ans, dy[i]);
        }

        System.out.println(ans);
    }
}

class Brick implements Comparable<Brick> {
    int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        // 넓이로 descend 정렬
        return o.s - this.s;
    }
}