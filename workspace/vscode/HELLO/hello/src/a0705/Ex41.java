package a0705;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요.>");
        int n =scanner.nextInt();
       if(30 <= n && n<= 40 || 60 <= n && n <= 70){
        System.out.println("슬기가 이겼습니다.");
       } else{
        System.out.println("슬기가 졌습니다.");
       }
    }
}
