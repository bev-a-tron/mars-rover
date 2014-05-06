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

    public void start(String input) {

        for (String command: input.split("")) {
            if (command.equals("M")) {
                marsRover.move();
            } else if (command.equals("L")) {
                marsRover.rotate("L");
            } else if (command.equals("R")) {
                marsRover.rotate("R");
            }
        }

        marsRover.printStatus();
    }

}
