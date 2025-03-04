package AssignMent;

//เขียนโปรแกรมเพื่อหาค่ามากที่สุดและน้อยที่สุดในอาร์เรย์

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 19, 33, 7};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("ค่าสูงสุด: " + max);
        System.out.println("ค่าต่ำสุด: " + min);
    }
}

    

