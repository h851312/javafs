package a0704;

import java.util.Scanner;

public class Ex6_11_9 {
       public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("첫번째 숫자를 입력하세요.>");
              int fsNum = scanner.nextInt();
              System.out.println("두번째 숫자를 입력하세요.>");
              int seNum = scanner.nextInt();

              int selectNum = (fsNum > seNum ) ? fsNum :seNum;
              System.out.println(selectNum);

       }
}
