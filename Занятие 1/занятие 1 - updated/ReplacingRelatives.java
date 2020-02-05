package pvt.automation;

public class ReplacingRelatives {
    void replaceRelatives(int[] array) {
        // пройти по массиву и поменять местами каждые 2 соседних элемента
        System.out.println("Replacing relatives");
        for (int i = 0; i < array.length - 1; i = i + 2) {
            int buffer;
            buffer = array[i];
            array[i] = array[i + 1];
            array[i + 1] = buffer;
            if (array.length % 2 == 1 && i == array.length - 3) {
                break;
            }
        }
    }
}
