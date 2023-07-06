package a0705;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("공의 위치를 입력하세요.>");
        int n = scanner.nextInt();

        if(50<= n && n<= 70 || n%6==0){
            System.out.println("슬기가 이겼습니다.");
        }else {
            System.out.println("슬기가 졌습니다.");
        }
        }
}
