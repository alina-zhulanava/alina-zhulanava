package pvt.automation;

public class Example {

    public static void main(String[] args) {
        int a = 12;
        int b = -8;
        Methods methods = new Methods();
        int min = methods.minimal(a, b);
        boolean even = methods.even(a);
        int square = methods.square(a);
        int cube = methods.cube(a);
        System.out.println("min: " + min + " Even? " + even + " square: " + square + " cube: " + cube);

        Student student = new Student();
        student.skipLectures();
        student.party();
        student.passExam();
    }
}
