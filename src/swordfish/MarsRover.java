package swordfish;

import java.util.HashMap;
import java.util.Map;

public class MarsRover {

    private Direction direction;
    private Point position;

    public MarsRover(Point position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public String followCommands(String input) {

        for (String letter: input.split("")) {

            if (commandMapper().containsKey(letter)) {
                Command command = commandMapper().get(letter);
                command.execute();
            }
        }

        return position.x + " "
             + position.y + " "
             + direction.cardinalDirection;

    }

    private Map<String, Command> commandMapper() {
        Map<String, Command> stringToCommand = new HashMap<String, Command>();
        stringToCommand.put("M", new MoveCommand(this));
        stringToCommand.put("L", new RotateLeftCommand(this));
        stringToCommand.put("R", new RotateRightCommand(this));
        return stringToCommand;
    }

    public void moveForward() {
        position.plus(direction.directionAsPoint());
    }

    public void rotateRight() {
        direction.plus(1);
    }

    public void rotateLeft() {
        direction.plus(3);
    }



}
