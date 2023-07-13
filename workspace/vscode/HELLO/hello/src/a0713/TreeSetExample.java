package a0713;

import java.util.NavigableSet;
import java.util.TreeSet;
//TreeSet을 사용하

public class TreeSetExample {
 public static void main(String[] args) {
       //TreeSet 컬렉션 생성
    TreeSet<Integer> scores = new TreeSet<>();
    
    //Integer객체 저장
    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);
    //treeSet은 자동으로 정렬하여 저장

    //정렬된 Integer객체를 하나씩 가져오기
    for(Integer s : scores){
        System.out.print(s + " ");
    }

    System.out.println("\n");

    //특정 iInteger 객체를 가져오기

    System.out.println("가장 낮은 점수 : " + scores.first());
    System.out.println("가장 높은 점수 : " + scores.last());
    System.out.println("95점 아래 점수 : " + scores.lower(95));
    System.out.println("95점 위의 점수 : " + scores.higher(95));
    System.out.println("95점 이거나 바로 아래 점수 : " + scores.floor(95));
    System.out.println("85점 이거나 바로 위의 점수 : " + scores.ceiling(85)+ "\n");

    //내림자순으로 정렬하기
    //descendingScore()
    NavigableSet<Integer>  descendingScores = scores.descendingSet();
    for(Integer s : descendingScores){
        System.out.print(s + " ");
    }
    System.out.println("\n");

    // 범위 검색(80<= )
    //tailSet()메서드를 사용하여 주어진 점위 이상의 요소들로 구성된
    //NavigableSet을 생성
    NavigableSet<Integer> rangSet = scores.tailSet(80, true);
    for(Integer s : rangSet){
        System.out.print(s + " ");
    }
    System.out.println("\n");

    //범위검색 (80<= score <90)

    rangSet = scores.subSet(80, true, 90, false);
    for(Integer s : rangSet){
        System.out.print(s + " ");
    }
}
 }

