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
                rotateRight();
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

    public void rotateRight() {

        int currentDirectionPlus90Degrees = VALID_DIRECTIONS.indexOf(this.direction) + 1;
        direction = VALID_DIRECTIONS.get(currentDirectionPlus90Degrees % 4);

    }

    public void rotateLeft() {

        int currentDirectionMinus90Degrees = VALID_DIRECTIONS.indexOf(this.direction) + 3;
        direction = VALID_DIRECTIONS.get(currentDirectionMinus90Degrees % 4);


    }
}
