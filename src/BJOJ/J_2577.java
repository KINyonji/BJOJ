package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = A*B*C;
        String num = String.valueOf(sum);
        String[] arr = num.split("");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        int arr[] =
    }
}
