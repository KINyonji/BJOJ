package BJOJ;

import java.util.Scanner;

public class B_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String B = scanner.next();
        System.out.println(B.charAt(2));
        System.out.println((B.charAt(2)));
        System.out.println(A*B.charAt(2));
        System.out.println(A*B.charAt(1));
        System.out.println(A*B.charAt(0));
        System.out.println(A*Integer.parseInt(B));
    }
}
