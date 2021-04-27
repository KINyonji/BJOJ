package BJOJ;

import java.io.*;

public class J_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int ten=0, one=0, newN= N ;

        int length = 0;
        while (true) {
            ten = (N % 100) / 10; //10의 자리
            one = N % 10; //1의 자리
            N = ((ten + one)%10)+(one*10);
            length+=1;
            if (N == newN) {
                sb.append(length);
            break;
            }
        }
        bw.write(String.valueOf(sb));
        bw.close();
        br.close();
    }
}
