package a0707.ex11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.>");
        int a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.>");
        int b = scanner.nextInt();
        float array[] = { a + b, a - b, a * b, a / b };
        Arrays.sort(array);

        for (float i : array) {
        }
        System.out.printf("%4f", array[3]);

    }
}
