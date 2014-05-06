package swordfish;

import java.io.PrintStream;

public class MarsRover {

    private int[] initialPosition;
    private String initialDirection;
    private PrintStream printStream;

    public MarsRover(int[] initialPosition, String initialDirection, PrintStream printStream) {
        this.initialPosition = initialPosition;
        this.initialDirection = initialDirection;
        this.printStream = printStream;
    }

    public void printStatus() {

        String statusToPrint = initialPosition[0] + " "
                             + initialPosition[1] + " "
                             + initialDirection;
        printStream.println(statusToPrint);

    }

    public void move() {

    }
}
