package swordfish;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    private List<String> VALID_DIRECTIONS = Arrays.asList("N", "E", "S", "W");

    @Test
    public void shouldMoveNorth() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "N");

        assertThat(rover.start("MMM"), is("0 3 N"));

    }

    @Test
    public void shouldMoveEast() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "E");

        assertThat(rover.start("MMM"), is("3 0 E"));

    }

    @Test
    public void shouldMoveSouth() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "S");

        assertThat(rover.start("MMMMM"), is("0 -5 S"));

    }

    @Test
    public void shouldRetrieveDirectionPoint() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "N");

        Point testPoint = rover.directionAsPoint();

        assertThat(testPoint, is(new Point(0, 1)));
    }


    @Ignore("TODO #3 | Beverly | implementation for rotateRight looks too ugly, reading clean code for now")
    @Test
    public void shouldRotateToTheRight() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "N");

        rover.rotateRight();

        assertThat(rover.start("RRR"), is("0 0 W"));

    }

}
