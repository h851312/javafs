package a0707.ex11;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 음식 번호를 고르세요.>");
        int first = scanner.nextInt();
        System.out.println("두번째 음식 번호를 고르세요.>");
        int second = scanner.nextInt();
        int food[] = {400, 340, 170, 100, 70};
        int select = food[first-1] + food[second-1];
        String a = "angry";
        String b = "no angry";
        if(select>500){
            System.out.printf("칼로리의 합이 %d으로 500을 넘어서 "+ a, select);
        }else {
            System.out.printf("칼로리의 합이 %d으로 500을 넘지 않아서 "+ b, select);
        }
    }    
}
