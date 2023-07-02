package a0630;

public class Ex4_4 {
    public static void main(String[] args) {
        int sum =0; //총합을 구하는 변수
        int s = 1; //값의 부호를 바꿔주는데 사용할 변수
        int num = 0;
        //조건값이 true이므로 무한 반복문이 된다.
        // for(int i =1; true; i++, s = -s){//매 반복마다 s의 값은 1, -1, 1, -1, ...
        //     num =s * i;
        //     sum = sum + num;
        //     if (sum >=100)
        //     break;
        //     System.out.println("sum:" + sum);
        // }
        // System.out.println("num:" + num);
        for(int i=1; sum <100; i++,s=-s){
            num =i*s;
            sum+=num;
        }
        System.out.println("sum : "+ sum);
        System.out.println("num : "+ num);

    }
}
