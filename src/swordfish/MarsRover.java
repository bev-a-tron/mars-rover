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

    public String start(String input) {

        Map<String, Command> stringToCommand = new HashMap<String, Command>();
        stringToCommand.put("M", new MoveCommand(this));
        stringToCommand.put("L", new RotateLeftCommand(this));
        stringToCommand.put("R", new RotateRightCommand(this));

        for (String letter: input.split("")) {

            if (stringToCommand.containsKey(letter)) {
                Command command = stringToCommand.get(letter);
                command.execute();
            }
        }

        return position.x + " "
             + position.y + " "
             + direction.cardinalDirection;

    }

    public void move() {
        position.plus(direction.directionAsPoint());
    }

    public void rotateRight() {
        direction.plus(1);
    }

    public void rotateLeft() {
        direction.plus(3);
    }



}
