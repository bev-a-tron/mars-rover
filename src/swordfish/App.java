package swordfish;

import java.util.ArrayList;
import java.util.List;

public class App {

    private String[] input;

    public App(String data) {
        this.input = data.split("\n");
    }

    public List<String> start() {

        showPlateau();
        return getFinalPositionOfRovers();

    }

    private MarsRover constructRover(String oneLineInput) {

        String[] position = oneLineInput.split(" ");
        int xPosition = Integer.parseInt(position[0]);
        int yPosition = Integer.parseInt(position[1]);
        String direction = position[2];

        return new MarsRover(new Point(xPosition, yPosition), new Direction(direction));

    }

    private void showPlateau() {
        System.out.println("The size of the plateau is: " + input[0]);
    }

    private int numberOfRovers() {
        return (input.length - 1) / 2;
    }

    private List<String> getFinalPositionOfRovers() {

        List<String> finalPositionOfRovers = new ArrayList<String>();

        for (int roverNumber = 1; roverNumber <= numberOfRovers(); roverNumber++) {

            int roverLineNumber = roverNumber * 2 - 1;
            int commandsLineNumber = roverLineNumber + 1;

            MarsRover marsRover = constructRover(input[roverLineNumber]);
            finalPositionOfRovers.add(marsRover.followCommands(input[commandsLineNumber]));

        }

        return finalPositionOfRovers;
    }
}
