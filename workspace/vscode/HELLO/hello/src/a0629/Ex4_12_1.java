package a0629;

public class Ex4_12_1 {
    public static void main(String[] args) {
        int i = 5;
        while (i--!=0) {
            //i--후위형으므로 조건식 평가된 후에 i값이 감소
            System.out.println(i + " - I can do it.");
        }
    }
}
