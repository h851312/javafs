package a0713;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {

        // HashSet컬렉션 생성
        Set<String> set = new HashSet<String>();

        // 객체 주가
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        // 객체를 하나씩 가져와서 처리
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            // 객체를 하나 가져오기
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("JSP")) {
                // 가져온 객체를 컬렉션에서 제거
                iterator.remove();
            }
        }

        // Iterater는 컬렉션의 요소들을 순회하면서 접근하는 인터페이스입니다.
        // iterator는 컬렉션의 내부 구조를 알 필요없이 요소들에 접근할 수 있도록 해줍니다.
        System.out.println();

        // 객체 제거
        set.remove("JDBC");

        // 객체를 하나씩 가져와서 처리
        for (String element : set) {
            System.out.println(element);
        }
        // set에 저장된 객체를 하나씩 가져와서 처리
    }
}
