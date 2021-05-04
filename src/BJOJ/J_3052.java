package BJOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class J_3052 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10]; //입력할 수 10개의 배열 생성
        int counts[] = new int[42]; //나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 배열 생성
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //수 10개 입력받기
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]%42]++; //입력받은 수 10개를 42로 나눈 나머지
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
