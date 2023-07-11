package a0711;

public class StringBuffer {    
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java");
        System.out.println("원본문자열 : " + str);

        System.out.println(str.append("수업"));
        System.out.println("append()메소드 호출후 원본 문자열 : " +str);
    }

    private char[] append(String string) {
        return null;
    }
}
