package pvt.automation;

import javax.xml.soap.SOAPPart;

public class IncrementDecrement {
    public void postfixIncrement() {
        System.out.println("Postfix x = 10; y = 13 - x++");
        int x = 10;
        int y = 13 - x++;
        System.out.println("y: " + y);
        System.out.println("x: " + x);
    }

    public void prefixIncrement() {
        System.out.println("Prefix x = 10; y = 13 - ++x");
        int x = 10;
        int y = 13 - ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public void showDifference() {
        this.postfixIncrement();
        this.prefixIncrement();
    }
}
