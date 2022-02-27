import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _09_04_최대_수입_스케쥴 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int maxDay = Integer.MIN_VALUE;
        ArrayList<Lecture> lectures = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int[] pay = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            lectures.add(new Lecture(pay[0], pay[1]));
            if (maxDay < pay[1])
                maxDay = pay[1];
        }
        Collections.sort(lectures);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int sum = 0;
        int j = 0;
        for (int i = maxDay; i > 0; i--) {
            for (; j < cnt; j++) {
                if (lectures.get(j).day < i) {
                    break;
                }
                pq.add(lectures.get(j).money); // offer 사용하면 예외처리 발생 안함
            }
            if (pq.size() != 0) {
                sum += pq.poll();
            }

        }
        System.out.println(sum);
    }
}

class Lecture implements Comparable<Lecture> {
    int money, day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }

}