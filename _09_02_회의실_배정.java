import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.StringTokenizer;
import java.util.Collections;

public class _09_02_회의실_배정 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Friend> meetings = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            int[] meeting = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            meetings.add(new Friend(meeting[0], meeting[1]));
        }

        System.out.println(solve(meetings));

    }

    private static int solve(ArrayList<Friend> meetings) {
        int ans = 0;
        int endTime = 0;

        Collections.sort(meetings);
        for (Friend meeting : meetings) {
            if (meeting.start >= endTime) {
                endTime = meeting.end;
                ans++;
            }
        }
        return ans;
    }
}

class Friend implements Comparable<Friend> {
    int start, end;

    public Friend(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Friend o) {
        // end: ascending
        return (this.end != o.end) ? this.end - o.end : this.start - o.start;
    }

}