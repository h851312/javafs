package a0710;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        //rc변수에 Television 객체에 대입
        rc = new Television();
        rc.turnOn();

        //rc변수에 Audio 객체를 대입(교체시킴)
        rc = new Audio();
        rc.turnOn();
    }
}
