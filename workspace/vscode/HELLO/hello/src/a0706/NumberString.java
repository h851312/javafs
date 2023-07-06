package a0706;

import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.>");
        int num = scanner.nextInt();
        // int num = num%10;
        int sum =0;
         while (num!=0){
            num = num%10; //sum= sum + num%10
            System.out.println(num);
            
        if (num == 1) {
            System.out.println("일");
        } else if (num == 2) {
            System.out.println("이");
        } else if (num == 3) {
            System.out.println("삼");
        } else if (num == 4) {
            System.out.println("사");
        } else if (num == 5) {
            System.out.println("오");
        } else if (num ==6) {
            System.out.println("육");
        } else if (num ==7) {
            System.out.println("칠");
        } else if (num ==8) {
            System.out.println("팔");
        } else if (num ==9) {
            System.out.println("구");
        }else{
           num /= 10; 
            return;
        }
    }

    }

}
