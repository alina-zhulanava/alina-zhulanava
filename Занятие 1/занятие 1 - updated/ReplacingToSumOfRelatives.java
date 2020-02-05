package pvt.automation;

public class ReplacingToSumOfRelatives {
    public double[] replaceToSumOfRelatives(int[] array) {
        //заменить элементы на полусумму соседних
        System.out.println("Replace to sum of relatives");
        double[] arrayOfHalfSums = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrayOfHalfSums[i] = (double) array[i + 1] / 2;
                continue;
            } else if (i == array.length - 1) {
                arrayOfHalfSums[i] = (double) array[i - 1] / 2;
                continue;
            }
            arrayOfHalfSums[i] = (double) (array[i - 1] + array[i + 1]) / 2;
        }
        return arrayOfHalfSums;
    }
}
