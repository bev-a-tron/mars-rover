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

        System.out.println(Direction.validDirections().get(VALID_DIRECTIONS.indexOf(direction)));

        Point direction = new Point(0, 0);

        if (this.direction.equals("N")) {

            direction = Direction.NORTH;

        } else if (this.direction.equals("S")) {

            direction = Direction.SOUTH;

        } else if (this.direction.equals("E")) {

            direction = Direction.EAST;

        } else if (this.direction.equals("W")) {

            direction = Direction.WEST;

        }

        point.plus(direction);

    }

    public void rotateRight() {

    }

    public void rotateLeft() {

    }
}
