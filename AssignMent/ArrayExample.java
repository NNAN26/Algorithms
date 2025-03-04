package AssignMent;

//สร้างอาร์เรย์ของจำนวนเต็มขนาด 5 และใส่ค่าตัวเลขลงไป จากนั้นให้พิมพ์ค่าของอาร์เรย์ออกมา

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

