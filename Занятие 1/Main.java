package pvt.automation;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arrayGenered = gener();
        print(arrayGenered);

        int[] array = arrayGenered;

        reverse(array);

        printGap(0, 25);

        printEven(0, 20);

        printEven(0, 20, 10);

        multiply(array);
        zeroElements(array);
        replaceRelatives(array);
        replaceToCenter(array);
        findMaxMin(array);
        checkRising(array);
        replaceToSumOfRelatives(array);
        moveRight(array);
        everyThirdMultipleOnThree(array);
    }

    static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return;
    }

    static void print(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return;
    }

    static void printGap(int begin, int end) {
        //Используя while вывести все числа от 0 до 25 в одну строку через пробел
        if (begin >= end) {
            System.out.println("Wrong gap!");
            return;
        }
        int bufferNumber = begin;
        while (bufferNumber < end) {
            System.out.print(bufferNumber + " ");
            bufferNumber++;
        }
        System.out.println();
    }

    static void printEven(int begin, int end) {
        //2. Используя for вывести каждое четное число от 2 до 20 включительно
        if (begin >= end) {
            System.out.println("Wrong gap!");
            return;
        } else if ((begin == 0) && (end == 1)) {
            System.out.println("No even!");
            return;
        } else {
            for (int bufferNumber = begin; bufferNumber <= end; bufferNumber++) {
                if (bufferNumber / 2 < 1) continue;
                System.out.print(bufferNumber % 2 == 0 ? bufferNumber + " " : "");
            }
            System.out.println();
            return;
        }
    }

    static void everyThirdMultipleOnThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) array[i] = array[i] * 2;
        }
        print(array);
    }

    static void printEven(int begin, int end, int bottomBoarder) {
        //3. Используя for вывести каждое четное число от 2 до 20 включительно и больше 10
        for (int bufferNumber = begin; bufferNumber <= end; bufferNumber++) {
            System.out.print(bufferNumber % 2 == 0 && bufferNumber > bottomBoarder ? bufferNumber + " " : "");
        }
        return;
    }

    static int[] gener() {
        System.out.println("Enter array size");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sizeOfArrayString = null;
        try {
            sizeOfArrayString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sizeOfAray = Integer.parseInt(sizeOfArrayString);
        if (sizeOfAray < 2) {
            System.out.println("too small");
            return null;
        }
        System.out.println(sizeOfAray);
        int[] array = new int[sizeOfAray];
        for (int i = 0; i < array.length; i++) {
            int zeroFlag = (int) Math.round(Math.random());
            if (zeroFlag == 1) array[i] = (int) Math.round(Math.random() * 100);
            else array[i] = 0;
        }
        System.out.println();
        return array;
    }

    static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void multiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print(array[i] + "*" + array[j] + "=" + array[i] * array[j] + " ");
            }
        }
        System.out.println();
    }

    static void zeroElements(int[] array) {
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
            if (array[i] == 0) System.out.print("zero element index: " + i + " ");
            i++;
        }
        System.out.println();
    }

    static void replaceRelatives(int[] array) {
        // пройти по массиву и поменять местами каждые 2 соседних
        //элемента
        for (int i = 0; i < array.length - 1; i = i + 2) {
            int buffer;
            buffer = array[i];
            array[i] = array[i + 1];
            array[i + 1] = buffer;
            if (array.length % 2 == 1 && i == array.length - 3) {
                break;
            }
        }
        print(array);
        return;
    }

    static void replaceToCenter(int[] array) {
        // пройти по
        //массиву и поменять местами первый и последний, второй и предпоследний и т.д.
        for (int i = 0; i < array.length / 2; i++) {
            int buffer;
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
            System.out.print(array[i] + " ");
        }
        print(array);
    }

    static void findMaxMin(int[] array) {
        //найти минимальный-максимальный элементы и вывести
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
            ;
        }
        System.out.print("Min: " + min + " Max: " + max);
        System.out.print(" Min index: " + min_index + " Max index: " + max_index);
        System.out.println();
    }

    static void checkRising(int[] array) {
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

    static void replaceToSumOfRelatives(int[] array) {
        //заменить элементы на полусумму соседних
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
        print(arrayOfHalfSums);
    }

    static void moveRight(int[] array) {
        int zeroElement = array[array.length - 2];
        int firstElement = array[array.length - 1];
        for (int i = array.length - 1; i > 1; i--) {
            array[i] = array[i - 2];
        }
        array[1] = firstElement;
        array[0] = zeroElement;
        print(array);
    }
}
