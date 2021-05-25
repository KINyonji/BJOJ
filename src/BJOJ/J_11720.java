package BJOJ;

import java.util.Scanner;

public class J_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); //숫자의 개수
        String a = in.next();
        in.close();

        int sum = 0;

        for(int i = 0; i < N; i++) {
            //charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
            sum += a.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}
