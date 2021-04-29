package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9]; // 정수 9개를 담을 배열 선언

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());   // 배열에 9개의 수를 넣음
        }
        //Arrays.stream(배열명) 배열 생성
        System.out.println(Arrays.stream(arr).max().getAsInt()); //최댓값 출력

        int count = 0; //배열의 몇번째 위치인지 나타낼 변수
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (Arrays.stream(arr).max().getAsInt())) {
                count=i;
                break;
            }
        }
        System.out.println(count+1); // 최댓값 위치 출력 - 0번째가 아닌 1번째로 나타내기에 +1을 해준다.
    }
}
