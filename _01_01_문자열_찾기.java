import java.io.*;

public class _01_01_문자열_찾기 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String line = br.readLine().toLowerCase();
    char character = Character.toLowerCase((char) br.read());

    int ans = 0;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == character) {
        ans++;
      }
    }

    bw.write(String.valueOf(ans));

    bw.flush();
    bw.close();
  }
}