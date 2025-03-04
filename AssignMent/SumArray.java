package AssignMent;

//เขียนโปรแกรมเพื่อหาผลรวมของค่าทั้งหมดในอาร์เรย์

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("ผลรวมของอาร์เรย์: " + sum);
    }
}

