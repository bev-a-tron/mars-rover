package swordfish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Direction {

    private List<String> VALID_DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    public static final Point NORTH = new Point(0, 1);
    public static final Point SOUTH = new Point(0, -1);
    public static final Point EAST = new Point(1, 0);
    public static final Point WEST = new Point(-1, 0);
    public String cardinalDirection;

    public Direction(String cardinalDirection) {

        this.cardinalDirection = cardinalDirection;

    }

    public static List<Point> validDirections() {
        List<Point> validDirections = new ArrayList<Point>();
        validDirections.add(NORTH);
        validDirections.add(EAST);
        validDirections.add(SOUTH);
        validDirections.add(WEST);
        return validDirections;
    }

    public void plus(int increment) {

        int newDirection = VALID_DIRECTIONS.indexOf(this.cardinalDirection) + increment;
        cardinalDirection = VALID_DIRECTIONS.get(newDirection % 4);

    }

    public Point directionAsPoint() {
        return validDirections().get(VALID_DIRECTIONS.indexOf(cardinalDirection));
    }
}
