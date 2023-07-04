package a0704;

public class KoreanExample {
    public static void main(String[] args) {
        //객체 생성시 주민 등록번호와 이름 전달

        Korean k1 = new Korean("123456-1234567", "감자바");
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);
        //Final필드는 값을 변경할 수 없음
        //k1.nation = "USA";
        //k1.ssn = "123-12-1234";

        //비 final 필드는 값 변경 가능
        k1.name = "김자바";
    }
}
