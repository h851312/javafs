package a0703;

public class Ex6_3_8 {
    public static void main(String[] args) {       
        int[][] array = {
            { 95, 86 },
            { 83, 92, 96 },
            { 78, 83, 93, 87, 88 }
        };
        int sum =0;
        int aver =0; 
        for (int i = 0; i < array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sum += array[i][j];
                aver = sum/array[i].length;
                
            }
        }
        System.out.println(sum);
        System.out.println(aver);
    }
}
