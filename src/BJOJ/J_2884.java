package BJOJ;

import java.util.Scanner;

public class J_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
            if (M < 45) {
                if (H!=0){
                    System.out.println((H-1)+" "+(M+15));
                }else {
                    System.out.println(23+" "+(M+15));
                }
            } else if (M >= 45) {
                System.out.println(H+" "+(M-45));
            }
        }
    }
}
