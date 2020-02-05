package pvt.automation;

public class Persone {
    private String name;

    public void introduce() {
        System.out.println("I'm " + this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public Persone(String name){
        this.setName(name);
        this.introduce();
    }

    public Persone(){
        this.setName("no name");
        this.introduce();
    }
}
