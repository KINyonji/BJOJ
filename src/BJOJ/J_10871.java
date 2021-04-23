package BJOJ;

import java.io.*;

public class J_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split(" ");
        int N = Integer.parseInt(strings[0]);
        int X = Integer.parseInt(strings[1]);

        String [] A = br.readLine().split(" ");
        int result;

        for (int i = 0; i < N; i++) {
            result = Integer.parseInt(A[i]);
            if (result < X) {
                bw.write(result+" ");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
