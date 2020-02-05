package pvt.automation;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        IncrementDecrement incrementDecrement = new IncrementDecrement();
        incrementDecrement.showDifference();

        PrintGap printGap = new PrintGap();
        printGap.printGap(1, 26);

        PrintingEven printingEven = new PrintingEven();
        printingEven.printEven(0, 20);
        printingEven.printEven(0, 20, 10);

        Printing printer = new Printing();

        GeneredArray generedArray = new GeneredArray();
        int[] array = generedArray.getGeneredArray();

        printer.print(array);
        printer.reverse(array);

        MultiplyingArrayMembers multiplyingArrayMembers = new MultiplyingArrayMembers();
        multiplyingArrayMembers.multiply(array);

        EveryThirdMultypliing everyThirdMultypliing = new EveryThirdMultypliing();
        everyThirdMultypliing.everyThirdMultipleOnTwo(array);
        printer.print(array);
        array = generedArray.getGeneredArray();
        everyThirdMultypliing.everyThirdMultipleOnTwo(array, 1);
        printer.print(array);
        array = generedArray.getGeneredArray();

        FindingZeroElements findingZeroElements = new FindingZeroElements();
        findingZeroElements.zeroElements(array);

        ReplacingRelatives replacingRelatives = new ReplacingRelatives();
        replacingRelatives.replaceRelatives(array);
        printer.print(array);
        array = generedArray.getGeneredArray();

        ReplacingToCenter replacingToCenter = new ReplacingToCenter();
        replacingToCenter.replaceToCenter(array);
        printer.print(array);
        array = generedArray.getGeneredArray();

        FindingMaxMin findingMaxMin = new FindingMaxMin();
        findingMaxMin.findMaxMin(array);

        CheckingRising checkingRising = new CheckingRising();
        checkingRising.checkRising(array);

        ReplacingToSumOfRelatives replacingToSumOfRelatives = new ReplacingToSumOfRelatives();
        printer.print(replacingToSumOfRelatives.replaceToSumOfRelatives(array));
        array = generedArray.getGeneredArray();

        MovingRight movingRight = new MovingRight();
        movingRight.moveRight(array);
        printer.print(array);
    }

}
