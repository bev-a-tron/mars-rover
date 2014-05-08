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

    }

    public void rotateLeft() {

    }
}
