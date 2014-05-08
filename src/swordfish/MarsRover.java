package swordfish;

public class MarsRover {

    private Direction direction;
    private Point point;

    public MarsRover(Point point, String direction) {
        this.point = point;
        this.direction = new Direction(direction);
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
             + direction.cardinalDirection;

    }

    public void move() {
        point.plus(direction.directionAsPoint());
    }

    public void rotate(String rotateDirection) {

        int incrementDirection = 0;

        if (rotateDirection.equals("R")) {
            incrementDirection = 1;
        } else if (rotateDirection.equals("L")) {
            incrementDirection = 3;
        }

        direction.plus(incrementDirection);

    }

}
