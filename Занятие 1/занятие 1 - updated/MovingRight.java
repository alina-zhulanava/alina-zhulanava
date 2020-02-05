package pvt.automation;

public class MovingRight {
    public void moveRight(int[] array) {
        System.out.println("Move Rigth to 2 positions");
        int zeroElement = array[array.length - 2];
        int firstElement = array[array.length - 1];
        for (int i = array.length - 1; i > 1; i--) {
            array[i] = array[i - 2];
        }
        array[1] = firstElement;
        array[0] = zeroElement;
    }
}
