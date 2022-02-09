import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03_01_두_배열_합치기 {
    public static void main(String[] args) {
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