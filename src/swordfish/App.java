package swordfish;

public class App {

    public String start(String data) {

        String[] input = data.split("\n");

        String sizeOfPlateau = input[0];
        System.out.println("The size of the plateau is: " + sizeOfPlateau);

        MarsRover marsRover = constructRover(input[1]);
        String commands = input[2];

        return marsRover.followCommands(commands);

    }

    private MarsRover constructRover(String input) {
        String[] position = input.split(" ");
        int xPosition = Integer.parseInt(position[0]);
        int yPosition = Integer.parseInt(position[1]);
        String direction = position[2];

        return new MarsRover(new Point (xPosition, yPosition), new Direction(direction));
    }

}
