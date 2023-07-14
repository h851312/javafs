package a0714.Ex7;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person(); 
        person.ordering(String :: compareToIgnoreCase);
        //String 클래스에 정의된 메소드
        //대소문자를 무시하고 두문자열을 사전적으로 비교
    }
}
