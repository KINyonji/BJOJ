package BJOJ;

import java.util.Scanner;

public class B_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String exam = "";

        if (score >= 0 && score <= 100) {
            switch (score/10){
                case 10:
                case 9:
                    exam = "A";
                    break;
                case 8:
                    exam = "B";
                    break;
                case 7:
                    exam = "C";
                    break;
                case 6:
                    exam = "D";
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                    exam = "F";
                    break;
            }
            System.out.println(exam);
        }

    }
}
