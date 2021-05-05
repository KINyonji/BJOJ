package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class J_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //시험 본 과목의 개수 입력

        double arr[] = new double[N]; //성적을 넣을 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //성적을 띄어쓰기로 나타내기 위함

        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken()); //입력받은 성적 배열에 넣기
        }

        Arrays.sort(arr); //배열 오름차순 정렬

        double sum = 0; //총 합

        for (int i = 0; i < N; i++) {
            sum += arr[i]/arr[arr.length-1]*100;
        }

        double aver = sum/N; //평균

        System.out.println(aver);
    }
}
