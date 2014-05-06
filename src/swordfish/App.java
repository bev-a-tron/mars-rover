package swordfish;

public class App {

    private MarsRover marsRover;

    public App(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public App() {
        this.marsRover = new MarsRover("0 0 N", System.out);
    }

    public void start() {

        marsRover.printStatus();

    }

}
