package AssignMent;
import java.util.LinkedList;

//สร้าง Linked List ของ String และเพิ่มข้อมูล 3 ค่า จากนั้นแสดงผล

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
