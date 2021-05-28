package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; //알파벳 소문자 갯수 26 만큼 int형 배열 생성 (문자열 S에 각 문자의 위치를 가리킬 배열)

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1; //int 형 배열을 -1로 초기과 시키기
        }

        String S = br.readLine(); // S라는 문자열 입력받기 (단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.)

        //반복문을 통해 문자열의 각 문자를 검사해여 함
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i); //charAt() 메소드를 사용하여 문자를 추출한 뒤 ch 변수에 저장

            if (arr[ch - 'a'] == -1) { //arr원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
