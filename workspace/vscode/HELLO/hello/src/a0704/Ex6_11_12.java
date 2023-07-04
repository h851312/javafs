package a0704;

import java.util.Scanner;

public class Ex6_11_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한변의 개수를 입력하세요.>");
        int n = scanner.nextInt();
        for(int i = 0; i <n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
