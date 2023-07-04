package a0704;

import java.util.Scanner;

public class Ex6_11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요.>");
        int a = scanner.nextInt();
        System.out.println("정수를 입력하세요.>");
        int b = scanner.nextInt();
        System.out.println("정수를 입력하세요.>");
        int c = scanner.nextInt();

        int fiNum = a > b? b: a;
        int seNum = fiNum > c ? c : fiNum;
        System.out.println(seNum);
        
    }
}
