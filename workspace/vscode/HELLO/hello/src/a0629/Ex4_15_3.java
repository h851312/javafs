package a0629;

public class Ex4_15_3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=100; i++){
            if(i%3 !=0){
                continue;
            }
            sum = sum + i;
            
        } 
        System.out.println(sum);
    }
    
}
