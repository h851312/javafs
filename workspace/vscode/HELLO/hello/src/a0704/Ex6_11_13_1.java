package a0704;

import java.util.Scanner;

public class Ex6_11_13_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]num = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("숫자를 입력해주세요.>");
            num[i] = scanner.nextInt();
        }
        int min =num[0];
        for(int i=0; i<num.length; i++){
            if(min > num[i]){
                min=num[i];
            }
        }
        System.out.println("최소값은?" + min);

        
    }
}
