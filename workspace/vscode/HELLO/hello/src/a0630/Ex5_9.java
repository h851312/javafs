package a0630;

public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }
        };
        //과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");
        System.out.println("===================================");
        for(int i = 0; i <score.length; i++){
            int sum = 0; //개인별 총점
            float avg = 0.0f;
            korTotal = korTotal + score[i][0];
            engTotal = engTotal + score[i][1];
            mathTotal = mathTotal +score[i][2];
            System.out.printf("%3d", i+1);
            for (int j=0; j <score[i].length; j++){
                sum = sum +score[i][j];
                System.out.printf("%6d", score[i][j]);//기본점수
            }
            avg = sum / (float) score[i].length; //평균계산
            System.out.printf("%6d %6.1f%n", sum, avg);
            }
            System.out.println("===================================");
            System.out.printf("총점: %3d %5d %5d%n", korTotal, engTotal, mathTotal);
    }
}
