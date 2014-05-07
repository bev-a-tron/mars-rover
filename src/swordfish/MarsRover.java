package swordfish;

public class MarsRover {

    private String direction;
    private Point point;

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
