package pvt.automation;

public class EveryThirdMultypliing {
    public void everyThirdMultipleOnTwo(int[] array) {
        System.out.println("Every third multiply on two (with %)");
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) array[i] = array[i] * 2;
        }
    }

    public void everyThirdMultipleOnTwo(int[] array, int second) {
        System.out.println("Every third multiply on two (with step)");
        for (int i = 2; i < array.length; i = i + 3) {
            array[i] = array[i] * 2;
        }
    }
}
