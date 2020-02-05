package pvt.automation;

public class CheckingRising {
    public void checkRising(int[] array) {
        //возрастающая последовательность?
        for (int i = 1; i < array.length; i++) {
            if ((array[i - 1] < array[i]) && (i == array.length - 1)) {
                System.out.println("Array is rising");
                break;
            } else if (array[i - 1] < array[i]) continue;
            else {
                System.out.println("Array is NOT rising");
                break;
            }
        }
    }
}
