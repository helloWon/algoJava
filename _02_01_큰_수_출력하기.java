import java.io.*;
import java.util.ArrayList;

public class _02_01_큰_수_출력하기 {

    static void solve(ArrayList<Integer> list){
        int temp = -1;
        for(int i=0; i<list.size(); i++){
            if(temp < list.get(i)){
                System.out.print(list.get(i) + " ");
            }
            temp = list.get(i);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<cnt; i++){
            list.add(Integer.parseInt(input[i]));
        }

        solve(list);
    }
}
