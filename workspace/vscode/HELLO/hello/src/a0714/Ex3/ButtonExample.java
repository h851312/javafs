package a0714.Ex3;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok버튼 객체에 람다식(ClickListener 익명구현 객체) 주입

        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다.");
        });
        // 익명함수
        // btnOk.setClickListener(new Button.ClickListener() {
        //     @Override
        //     public void onClick() {
        //         System.out.println("Ok 버튼을 클릭했습니다.");
        //     }
        // });

        // Ok 버튼 클릭하기
        btnOk.click();

        // cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });
        // 익명함수
        // btnCancel.setClickListener(new Button.ClickListener() {
        //     @Override
        //     public void onClick() {
        //         System.out.println("Cancel 버튼을 클릭했습니다.");
        //     }
        // });

        // Cancle 버튼 클릭하기
        btnCancel.click();
    }
}
