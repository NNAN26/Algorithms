package AssignMent;
import java.util.LinkedList;

//เขียนโปรแกรมเพื่อหาข้อมูลใน Linked List ว่ามีค่านั้นอยู่หรือไม่

public class FindInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        if (names.contains("Bob")) {
            System.out.println("พบค่า Bob ใน Linked List");
        } else {
            System.out.println("ไม่พบค่า Bob");
        }
    }
}
