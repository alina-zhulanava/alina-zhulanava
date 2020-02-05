package pvt.automation;

public class Printing {
    public void print(int[] array) {
        System.out.println("Observe array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return;
    }

    public void reverse(int[] array) {
        System.out.println("Observe reverse array");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void print(double[] array) {
        System.out.println("Observe array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return;
    }
}
