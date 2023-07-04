package a0704;

public class Ex6_11_1 {
    public static void main(String[] args) {
        Cars c1 = new Cars("white", "auto", 4);
        Cars c2 = new Cars("red", "auto", 5);

        System.out.println("C1의 color = " + c1.color + ", gearType =" + c1.gearType + ", door =" + c1.door);
        System.out.println("C2의 color = " + c2.color + ", gearType =" + c2.gearType + ", door =" + c2.door);
    }
}

class Cars {
    String color;
    String gearType;
    int door;

    // Cars(){}
    Cars(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;

    }
}