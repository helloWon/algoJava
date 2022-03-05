import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _06_07_좌표정렬 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Coordinate> arr = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr.add(new Coordinate(input[0], input[1]));
        }

        Collections.sort(arr);
        for (Coordinate cor : arr) {
            System.out.println(cor.x + " " + cor.y);
        }
    }
}

class Coordinate implements Comparable<Coordinate> {
    int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        return (this.x != o.x) ? this.x - o.x : this.y - o.y;
    }
}