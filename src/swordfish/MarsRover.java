package swordfish;

public class MarsRover {

    private Direction direction;
    private Point position;

    public MarsRover(int x, int y, String direction) {
        this.position = new Point(x, y);
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

        return position.x + " "
             + position.y + " "
             + direction.cardinalDirection;

    }

    public void move() {
        position.plus(direction.directionAsPoint());
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
