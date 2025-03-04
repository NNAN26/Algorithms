package AssignMent;
import java.util.LinkedList;

//เขียนโปรแกรมสลับค่าตัวแรกกับตัวสุดท้ายใน Linked List

public class SwapLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String first = names.getFirst();
        String last = names.getLast();

        names.set(0, last);
        names.set(names.size() - 1, first);

        System.out.println("Linked List หลังจากสลับค่า: " + names);
    }
}


