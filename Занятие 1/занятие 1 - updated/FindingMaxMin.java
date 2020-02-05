package pvt.automation;

public class FindingMaxMin {
    public void findMaxMin(int[] array) {
        //найти минимальный-максимальный элементы и вывести
        System.out.println("Finding Max and Min");
        int min = array[0];
        int max = 0;
        int min_index = 0;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                min_index = i;
                continue;
            }
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }
        if (max == min) {
            System.out.print("Are you kidding - here only one number!");
            return;
        } else System.out.println("Min: " + min + " Max: " + max);
        this.findingEqual(array, min, "Min");
        this.findingEqual(array, max, "Max");
        System.out.println();
    }

    private void findingEqual(int[] array, int number, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(name+" is element with index " + i);
            }
        }
    }
}
