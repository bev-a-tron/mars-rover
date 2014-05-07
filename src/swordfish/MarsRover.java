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

            direction = new Point(0, 1);

        } else if (this.direction.equals("S")) {

            direction = new Point(0, -1);

        } else if (this.direction.equals("E")) {

            direction = new Point(1, 0);

        } else if (this.direction.equals("W")) {

            direction = new Point(-1, 0);

        }

        point.plus(direction);

    }

    public void rotateRight() {

    }

    public void rotateLeft() {

    }
}
