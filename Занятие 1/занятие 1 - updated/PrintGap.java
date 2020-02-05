package pvt.automation;

public class PrintGap {
    public void printGap(int begin, int end) {
        //Используя while вывести все числа от 0 до 25 в одну строку через пробел
        System.out.println("вывести все числа от 0 до 25 в одну строку через пробел");
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
}
