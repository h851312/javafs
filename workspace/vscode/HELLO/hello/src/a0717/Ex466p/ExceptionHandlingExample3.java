package a0717.Ex466p;

public class ExceptionHandlingExample3 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자수 : " + result);
        } catch (NullPointerException e) {
            System.out.println("예외발생: "+ e.getMessage()); //예외메시지 출력
        } finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램종료]");
    }
}
