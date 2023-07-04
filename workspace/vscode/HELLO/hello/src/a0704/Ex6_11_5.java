package a0704;

import java.util.Scanner;

public class Ex6_11_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요>");
        float a = scanner.nextFloat();
        //5.635.System.out.printf("소수점 셋째 자리에서 반올림한 수는 %.2f", a);

        a =(a +0.005f)*100;
        System.out.println(a);
        int i = (int) a;
        System.out.println(i);
        a = (float) i/100;
        System.out.println(a);

    }
}
