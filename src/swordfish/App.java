package swordfish;

import java.io.PrintStream;

public class App {

    private final PrintStream printStream;
    private MarsRover marsRover;

    public App(MarsRover marsRover, PrintStream printStream) {
        this.marsRover = marsRover;
        this.printStream = printStream;
    }

    public App() {
        this.marsRover = new MarsRover("");
        this.printStream = System.out;
    }

    public void start() {

        marsRover.printStatus(printStream);

    }

}
