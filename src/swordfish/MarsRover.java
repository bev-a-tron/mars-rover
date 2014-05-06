package swordfish;

import java.io.PrintStream;

public class MarsRover {

    private String status;

    public MarsRover(String status) {

        this.status = status;
    }

    public void printStatus(PrintStream printStream) {

        printStream.println(status);

    }
}
