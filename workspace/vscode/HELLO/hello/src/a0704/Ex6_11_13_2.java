package a0704;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_11_13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]num = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("숫자를 입력해주세요.>");
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        int min = num[0]; //정렬된 배열의 첫번째 원소가 최소값
        System.out.println("최소값은?" + min);

        
    }
}
