package swordfish;

public class MarsRover {

    private int[] position;
    private String direction;
    private Point point;

    public MarsRover(int[] initialPosition, String initialDirection, Point point) {
        this.position = initialPosition;
        this.direction = initialDirection;
        this.point = point;
    }

    public MarsRover(int[] initialPosition, String initialDirection) {
        this.position = initialPosition;
        this.direction = initialDirection;
    }

    public String printStatus() {

        String statusToPrint = position[0] + " "
                             + position[1] + " "
                             + direction;

        return statusToPrint;
    }

    public void move() {

        if (direction.equals("N")) {
            position[1] ++;
        } else if (direction.equals("S")) {
            position[1] --;
        } else if (direction.equals("E")) {
            position[0] ++;
        } else if (direction.equals("W")) {
            position[0] --;
        }

    }

    public void rotateRight() {

    }

    public void rotateLeft() {

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

        return printStatus();
    }
}
