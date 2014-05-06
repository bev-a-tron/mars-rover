package swordfish;

import java.io.PrintStream;

public class MarsRover {

    private int[] position;
    private String direction;
    private PrintStream printStream;

    public MarsRover(int[] initialPosition, String initialDirection, PrintStream printStream) {
        this.position = initialPosition;
        this.direction = initialDirection;
        this.printStream = printStream;
    }

    public void printStatus() {

        String statusToPrint = position[0] + " "
                             + position[1] + " "
                             + direction;
        printStream.println(statusToPrint);

    }

    public void move() {

        if (direction.equals("N")) {
            position[1] ++;
        } else if (direction.equals("S")) {
            position[1] --;
        } else if (direction.equals("E")) {
            position[0] ++;
        } else if (direction.equals("W")) {
            position[0] --;
        }
    }

    public void rotate(String rotateDirection) {

    }
}
