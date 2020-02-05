package pvt.automation;

public class Methods {
    public int minimal(int a, int b) {
        if (a == b) {
            System.out.println("Numbers are equal");
            return 0;
        }
        if (a < b) return a;
        else return b;
    }

    public boolean even(int a) {
        if (a % 2 == 0) return true;
        else return false;
    }

    public int square(int a) {
        return Math.abs(a) * Math.abs(a);
    }

    public int cube(int a) {
        return square(a) * Math.abs(a);
    }
}
