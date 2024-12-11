package Ep2;

import java.util.Random;

public class grade {
    public static void main(String[] args) {
        int numStudents = 10; // จำนวนนักเรียน
        int[] scores = new int[numStudents]; // สร้าง array 1 มิติสำหรับเก็บคะแนน
        Random r = new Random();

        // สุ่มคะแนน 40-99
        for (int i = 0; i < numStudents; i++) {
            scores[i] = r.nextInt(60) + 40; // จะได้ช่วง 40-99

        }

        // แสดงคะแนนและเกรด
        System.out.println("Student Scores and Grades:");
        for (int i = 0; i < numStudents; i++) {
            int score = scores[i]; //กำหนดค่าตัวแปร
            String grade = calculateGrades(score); // เปลี่ยนชนิดของ grade เป็น String
            System.out.println("Student " + (i + 1) + ": Score = " + score + ", Grade = " + grade);
        }
    }

    // สำหรับคำนวณเกรด
    public static String calculateGrades(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 75 && score <= 79) {
            return "B+";
        } else if (score >= 70 && score <= 74) {
            return "B";
        } else if (score >= 65 && score <= 69) {
            return "C+";
        } else if (score >= 60 && score <= 64) {
            return "C";
        } else if (score >= 55 && score <= 59) {
            return "D+";
        } else if (score >= 50 && score <= 54) {
            return "D";
        } else {
            return "F";
        }
    }
}




