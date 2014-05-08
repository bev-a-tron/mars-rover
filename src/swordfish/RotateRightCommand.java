package swordfish;

public class RotateRightCommand implements Command {
    private MarsRover rover;

    public RotateRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override

    public void execute() {

        rover.rotateRight();

    }
}
