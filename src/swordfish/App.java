package swordfish;

public class App {

    private MarsRover marsRover;

    public App(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    public App() {
        int[] initialPosition = {0, 0};
        String initialDirection = "N";
        this.marsRover = new MarsRover(initialPosition, initialDirection, System.out);
    }

    public void start() {

        marsRover.move();
        marsRover.printStatus();

    }

}
