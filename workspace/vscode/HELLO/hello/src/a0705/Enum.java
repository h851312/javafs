package a0705;

enum Rainbow {RED,}
public class Enum {    public static void main(String[] args) {

        Rainbow[] arr = Rainbow.values();

        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
    }
}
