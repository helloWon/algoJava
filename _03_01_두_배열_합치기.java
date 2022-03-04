import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03_01_두_배열_합치기 {

    // Time: 332ms Mem: 32MB
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer.parseInt(br.readLine());
        int[] arr0 = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Integer.parseInt(br.readLine());
        int[] arr1 = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<Integer> store = new ArrayList<>();
        for (int i : arr0) {
            store.add(i);
        }

        for (int i : arr1) {
            store.add(i);
        }
        Collections.sort(store); // FIXME: 이거랑 arr.sort() 차이는?
        store.forEach(s -> System.out.print(s + " "));
    }

    // Time: 271ms Mem: 34MB
    public static void solution1(String[] args){
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();
        String[] input1 = in.nextLine().split(" ");
        in.nextInt();
        in.nextLine();
        String[] input2 = in.nextLine().split(" ");

        List<Integer> newList = new ArrayList<>();
        for (String s : input1) {
            newList.add(Integer.parseInt(s));
        }
        for (String s : input2) {
            newList.add(Integer.parseInt(s));
        }

        Collections.sort(newList);
        newList.forEach(result -> System.out.print(result + " "));
        in.close();
        return;
    }
}