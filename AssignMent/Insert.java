package AssignMent;
import java.util.LinkedList;

//แทรกค่าที่ตำแหน่งที่ 2 ของ Linked List แล้วแสดงผล

public class Insert {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Charlie");

        names.add(1, "Bob");

        System.out.println("Linked List หลังจากแทรกค่า: " + names);
    }
}