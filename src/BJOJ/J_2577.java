package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String num = String.valueOf(val); //int를 String으로 변환

        for (int i = 0; i < num.length(); i++) {
            arr[(num.charAt(i)-48)]++; //charAt() 사용해서 문자열에서 문자를 하나씩 뽑고 아스키코드를 활용해 숫자로 만들어 ++ 세기
        }

        for (int v : arr) {
            System.out.println(v);
        }
    }
}
