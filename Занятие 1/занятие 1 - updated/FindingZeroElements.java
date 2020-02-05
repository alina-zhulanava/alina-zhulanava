package pvt.automation;

public class FindingZeroElements {
    public void zeroElements(int[] array) {
        System.out.println("Finding zero elements");
        //найти количество нулевых элементов, вывести
        //количество. если нулевых элементов нет - вывести сообщение, что их нет
        int i = 0;
        int zeroCounter = 0;
        while (i < array.length) {
            if (array[i] == 0) zeroCounter++;
            i++;
        }
        System.out.println(zeroCounter == 0 ? "no zero elements" : zeroCounter + " zero elements");
        int zeroElementsIndexes[] = new int[zeroCounter];
        i = 0;
        while (i < array.length) {
            if (array[i] == 0) System.out.println("zero element index: " + i + " ");
            i++;
        }
        System.out.println();
    }
}
