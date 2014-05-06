package swordfish;

public class App {

    private MarsRover marsRover;

    public App(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public App() {
        String initialPosition = "0 0 N";
        this.marsRover = new MarsRover(initialPosition, System.out);
    }

    public void start() {

        marsRover.printStatus();

    }

}
