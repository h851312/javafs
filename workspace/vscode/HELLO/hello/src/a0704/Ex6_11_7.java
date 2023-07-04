package a0704;

import java.util.Scanner;

public class Ex6_11_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도 4자리를 입력하세요>");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요.>");
        int month = scanner.nextInt();
        System.out.println("일을 입력하세요.>");
        int day = scanner.nextInt();

        //%: 심볼
        //02: 2자리수가 안되면 0으로 출력
        //d: 10진수 형태로 출력

       //System.out.printf("%4d.%02d.%02d", year,month,day);
        String month1 = String.format("%02d", month);
        String day1 = String.format("%02d", day);

        System.out.println(year+"."+month1+"."+day1);
    }
}
