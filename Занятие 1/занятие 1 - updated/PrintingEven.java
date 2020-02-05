package pvt.automation;

public class PrintingEven {
    public void printEven(int begin, int end) {
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

    void printEven(int begin, int end, int bottomBoarder) {
        //3. Используя for вывести каждое четное число от 2 до 20 включительно и больше 10
        if (begin >= end) {
            System.out.println("Wrong gap!");
            return;
        } else if ((begin == 0) && (end == 1)) {
            System.out.println("No even!");
            return;
        } else {
            for (int bufferNumber = begin; bufferNumber <= end; bufferNumber++) {
                System.out.print(bufferNumber % 2 == 0 && bufferNumber > bottomBoarder ? bufferNumber + " " : "");
            }
            System.out.println();
            return;
        }
    }
}
