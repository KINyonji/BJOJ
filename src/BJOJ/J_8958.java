package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine()); //테스트 케이스

        String[] arr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < testCase; i++) {
            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
