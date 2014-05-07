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

        if (direction.equals("N")) {

            Point directionAsPoint = new Point(0, 1);
            point.plus(directionAsPoint);

        } else if (direction.equals("S")) {

            Point directionAsPoint = new Point(0, -1);
            point.plus(directionAsPoint);

        } else if (direction.equals("E")) {

            Point directionAsPoint = new Point(1, 0);
            point.plus(directionAsPoint);

        } else if (direction.equals("W")) {

            Point directionAsPoint = new Point(-1, 0);
            point.plus(directionAsPoint);
        }

    }

    public void rotateRight() {

    }

    public void rotateLeft() {

    }
}
