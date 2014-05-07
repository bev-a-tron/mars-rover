package swordfish;

import java.util.ArrayList;
import java.util.List;

public class Direction {

    public static final Point NORTH = new Point(0, 1);
    public static final Point SOUTH = new Point(0, -1);
    public static final Point EAST = new Point(1, 0);
    public static final Point WEST = new Point(-1, 0);

    public static List<Point> validDirections() {
        List<Point> validDirections = new ArrayList<Point>();
        validDirections.add(NORTH);
        validDirections.add(EAST);
        validDirections.add(SOUTH);
        validDirections.add(WEST);
        return validDirections;
    }

}
