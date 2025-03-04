package AssignMent;
import java.util.LinkedList;

//ลบค่าทั้งหมดใน Linked List และตรวจสอบว่ามันว่างหรือไม่

public class ClearLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");

        names.clear();

        if (names.isEmpty()) {
            System.out.println("Linked List ว่าง");
        } else {
            System.out.println("Linked List ยังมีค่าอยู่");
        }
    }
}
