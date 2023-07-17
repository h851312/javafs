package a0717.ex717p.Ex07;

public class Member {
    private String name;
    private String job;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
