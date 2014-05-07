package swordfish;

public class MarsRover {

    private int[] position;
    private String direction;
    private Point point;

    public MarsRover(Point point, String direction) {
        this.point = point;
        this.position = new int[]{point.x, point.y};
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

        return position[0] + " "
             + position[1] + " "
             + direction;

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
}
