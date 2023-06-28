package a0628;

public class Ex3_12 {
    public static void main(String[] args) {
        int x = 10;
        int y = 8;
        //10을 8로 나누면 몫은 1이고 나머지는 2입니다.
        // System.out.println("10을 8로 나누면");
        // System.out.println("몫은 " + x / y + "이고, 나머지는 " + x % y + "입니다.");
        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d 이고, 나머지는 %d입니다. %n", x / y, x % y);
    }
}
