package BJOJ;

import java.util.Scanner;

public class J_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String exam = "";

        if (score >= 0 && score <= 100) {
            if(score>=90){
                exam = "A";
            }else if (score>=80){
                exam = "B";
            }else if (score>=70){
                exam = "C";
            }else if (score>=60){
                exam = "D";
            }else {
                exam = "F";
            }
            System.out.println(exam);
        }

    }
}
