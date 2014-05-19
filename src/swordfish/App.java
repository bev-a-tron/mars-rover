package swordfish;

import java.util.ArrayList;
import java.util.List;

public class App {

    private String[] input;

    public App(String data) {
        this.input = data.split("\n");
    }

    public List<String> start() {

        showPlateau(input[0]);

        return getFinalPositionOfRovers(countRovers());

    }

    private List<String> getFinalPositionOfRovers(int numberOfRovers) {

        List<String> outputForAllRovers = new ArrayList<String>();

        for (int currentRover = 1; currentRover <= numberOfRovers; currentRover++) {
            int lineNumber = currentRover * 2 - 1;
            MarsRover marsRover = constructRover(input[lineNumber]);
            outputForAllRovers.add(marsRover.followCommands(input[lineNumber + 1]));
        }

        return outputForAllRovers;
    }

    private void showPlateau(String plateauInput) {
        System.out.println("The size of the plateau is: " + plateauInput);
    }

    private MarsRover constructRover(String oneLineInput) {
        String[] position = oneLineInput.split(" ");
        int xPosition = Integer.parseInt(position[0]);
        int yPosition = Integer.parseInt(position[1]);
        String direction = position[2];

        return new MarsRover(new Point(xPosition, yPosition), new Direction(direction));
    }

    public int countRovers() {
        return (input.length - 1) / 2;
    }
}
