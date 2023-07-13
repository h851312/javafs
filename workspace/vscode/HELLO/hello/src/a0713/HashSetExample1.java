package a0713;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        
        //HashWst컬렉션 생성
        Set<Member> set = new HashSet<Member>();


            //Member 객체저장
            set.add(new Member("홍길동", 30));
            set.add(new Member("홍길동", 30));

            //저장된 객체 출력
            System.out.println("총 객체수 : " + set.size());
        }   
    }
    //위의 예제 Member 클래스에서 hashCode()와 equals() 메서드를 재정의 했기 때문에
    //동일한 필드 값을 가지는 객체는 동등한 객체로 취급됩니다.
    //중복된 객체는 하나로 처리 HashSet 컬렉션은 중복을 제거한 유일한 객체만을 저장합니다.

