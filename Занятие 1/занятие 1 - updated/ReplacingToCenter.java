package pvt.automation;

public class ReplacingToCenter {
    public void replaceToCenter(int[] array) {
        // пройти по массиву и поменять местами первый и последний, второй и предпоследний и т.д.
        System.out.println("Replace to center");
        for (int i = 0; i < array.length / 2; i++) {
            int buffer;
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
    }
}
