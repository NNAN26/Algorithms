package AssignMent;
import java.util.LinkedList;

//ลบค่าตัวแรกของ Linked List แล้วแสดงผลลัพธ์

public class RemoveFirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.removeFirst();

        System.out.println("Linked List หลังจากลบตัวแรก: " + names);
    }
}
