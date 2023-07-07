package a0707.ex;

public class Member10 {
    public String id;

    public Member10(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member10){
            Member10 target = (Member10) obj;
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
