package swordfish;

public class RotateLeftCommand implements Command {
    private MarsRover rover;

    public RotateLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {

        rover.rotateLeft();

    }
}
