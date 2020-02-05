package pvt.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneredArray {
    private int arraySize;
    private int[] array;

    public GeneredArray() throws IOException {
        setArraySize();
        int[] bufferArray = new int[this.arraySize];
        this.array = bufferArray;
        this.array = this.gener();
    }

    public int[] gener() throws IOException {
        int[] array = new int[arraySize];
        this.randomFilling();
        return this.getGeneredArray();
    }

    private void setArraySize() throws IOException {
        System.out.println("Enter array size");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sizeOfArrayString = null;
        try {
            sizeOfArrayString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.arraySize = Integer.parseInt(sizeOfArrayString);
        if (this.arraySize < 2) {
            System.out.println("too small");
            this.setArraySize();
        } else {
            reader.close();
            return;
        }
    }

    private void randomFilling() {
        for (int i = 0; i < this.arraySize; i++) {
            int zeroFlag = (int) Math.round(Math.random());
            if (zeroFlag == 1) this.array[i] = (int) Math.round(Math.random() * 100);
            else this.array[i] = (int) Math.round(Math.random() * 10);
        }
        return;
    }


    public int[] getGeneredArray() {
        int[] arrayCopy = new int[this.arraySize];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = this.array[i];
        }
        return arrayCopy;
    }
}
