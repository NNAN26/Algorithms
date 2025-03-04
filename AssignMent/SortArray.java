package AssignMent;
import java.util.Arrays;

//เขียนโปรแกรมเพื่อทำการเรียงลำดับอาร์เรย์จากน้อยไปมาก

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {42, 12, 89, 27, 34};

        Arrays.sort(numbers);

        System.out.println("อาร์เรย์หลังจากเรียงลำดับ: " + Arrays.toString(numbers));
    }
    
}
