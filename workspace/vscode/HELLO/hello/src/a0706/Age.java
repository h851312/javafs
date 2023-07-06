package a0706;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int male = scanner.nextInt();
        int birth_year;
        if(male == 1 ||male==2){
            birth_year = 1900 + number /10000;
        }else {
            birth_year = 2000 +number /10000;
        }
        int age = 2023 -birth_year;
        System.out.println("나이는 : "+ age);
    
    }
}
