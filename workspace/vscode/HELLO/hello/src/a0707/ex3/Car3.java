package a0707.ex3;

public class Car3 {
    private String modelname;
    private int modelYear;
    private String   color;
    private int maxSpeed;

    
    Car3(String modelname, int modelYear, String color, int maxSpeed) {
        this.modelname = modelname;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car3() {
        this("아반떼", 2016, "흰색", 200);
    }
    
    public String getModel(){
        return this.modelYear + "년식" + this.modelname + " " + this.color;
    }
}


