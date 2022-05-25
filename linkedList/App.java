package linkedList;
import linkedList.LinkedList;
import linkedList.LinkedList.ListIterator;

public class App {
    
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        LinkedList.ListIterator li = numbers.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
    }
}
