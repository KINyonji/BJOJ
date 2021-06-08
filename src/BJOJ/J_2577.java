package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[30];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < num.length; i++) {
            num[i]=A*B*C;
            System.out.print(num[i]+",");
        }
        System.out.println();

//        int[] count = new int[10];
//
//        for (int i = 0; i < M.len; i++) {
//
//        }
    }
}
