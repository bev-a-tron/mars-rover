package swordfish;

import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private String direction;
    private Point point;
    private List<String> VALID_DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    public MarsRover(Point point, String direction) {
        this.point = point;
        this.direction = direction;
    }

    public String start(String input) {

        for (String command: input.split("")) {
            if (command.equals("M")) {
                move();
            } else if (command.equals("L")) {
                rotate("L");
            } else if (command.equals("R")) {
                rotate("R");
            }
        }

        return point.x + " "
             + point.y + " "
             + direction;

    }

    public void move() {
        point.plus(directionAsPoint());
    }

    public Point directionAsPoint() {
        return Direction.validDirections().get(VALID_DIRECTIONS.indexOf(this.direction));
    }

    public void rotate(String rotateDirection) {

        int incrementDirection = 0;

        if (rotateDirection.equals("R")) {
            incrementDirection = 1;
        } else if (rotateDirection.equals("L")) {
            incrementDirection = 3;
        }

        int newDirection = VALID_DIRECTIONS.indexOf(this.direction) + incrementDirection;
        direction = VALID_DIRECTIONS.get(newDirection % 4);

    }

}
