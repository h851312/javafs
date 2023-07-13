package a0713;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        //Tree 컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        //객체 저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        //객체 하나씩 가져오기
        for(Person person : treeSet){
            System.out.println(person.name + ":" + person.age);
        }
    }
}
