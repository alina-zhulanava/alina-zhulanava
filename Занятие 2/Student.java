package pvt.automation;

public class Student extends Persone {
    void skipLectures() {
        System.out.println("Today I will go to the second lecture");
    }

    public void party() {
        System.out.println("Party!!!!");
    }

    protected void passExam() {
        System.out.println("pass exam");
    }

    private void sleepAsDeadMan() {
        System.out.println("Zzzzzz");
    }

    public void introduce(){
        System.out.println("I'm student");
    }
}
