package pvt.automation;

public class MultiplyingArrayMembers {
    public void multiply(int[] array) {
        System.out.println("Multiplying Array Members");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "*" + array[j] + "=" + array[i] * array[j] + " ");
            }
        }
        System.out.println();
    }
}
