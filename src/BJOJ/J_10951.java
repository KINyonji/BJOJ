package BJOJ;

import java.io.*;
import java.util.StringTokenizer;

public class J_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();
        String s;
        StringTokenizer st;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s); //토크나이져를 통해 파싱을 한다 지금은 띄어쓰기 단위로 잘라준다
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int sum = A + B;
            stringBuilder.append(sum).append("\n");
        }
        bw.write(stringBuilder.toString()); //출력 가능한 String 형태로 변환
        // write한다고 해서 바로바로 출력되지 않습니다.
        // 직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
        // BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문입니다.
        br.close();
        bw.flush(); // close는 stream을 닫아버리기 때문에 계속 출력하고자 한다면 flush 사용합니다.
        bw.close();
    }
}
