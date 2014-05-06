package swordfish;

import java.io.PrintStream;

public class MarsRover {

    private String status;
    private PrintStream printStream;

    public MarsRover(String status, PrintStream printStream) {

        this.status = status;
        this.printStream = printStream;

    }

    public void printStatus() {

        printStream.println(status);

    }
}
