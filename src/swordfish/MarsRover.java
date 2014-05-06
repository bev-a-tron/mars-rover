package swordfish;

import java.io.PrintStream;

public class MarsRover {

    private String status;
    private PrintStream printStream;

    public MarsRover(String initialPosition, PrintStream printStream) {

        this.status = initialPosition;
        this.printStream = printStream;

    }

    public void printStatus() {

        printStream.println(status);

    }
}
