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
                rotateLeft();
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

        int currentDirectionPlus90Degrees = VALID_DIRECTIONS.indexOf(this.direction) + incrementDirection;
        direction = VALID_DIRECTIONS.get(currentDirectionPlus90Degrees % 4);

    }

    public void rotateLeft() {

        int currentDirectionMinus90Degrees = VALID_DIRECTIONS.indexOf(this.direction) + 3;
        direction = VALID_DIRECTIONS.get(currentDirectionMinus90Degrees % 4);


    }
}
