package a0707.ex10;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int arr[] = {4, 23, 33, 15, 17, 19};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.println("["+i+"]");
        }
    }
}
