package a0704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6_11_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요>");
        float a = scanner.nextFloat();
        DecimalFormat df = new DecimalFormat("#.##");
        String rounded =df.format(a);
        System.out.println(rounded);
       

    }
}
