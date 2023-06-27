package a0627;

public class X3 {
    public static void main(String[] args) {
        int pencils = 534;
        int student = 30;

        //학생 한명이 가지는 연필수
        int pencilsPerStudent = (pencils / student);
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (pencils % student);
        System.out.println(pencilsLeft);
    }
}
