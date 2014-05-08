package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

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


    @Test
    public void shouldRotateToTheRight() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "N");

        assertThat(rover.start("RRR"), is("0 0 W"));

    }

    @Test
    public void shouldRotateToTheLeft() throws Exception {

        MarsRover rover = new MarsRover(new Point(0, 0), "N");

        assertThat(rover.start("LLL"), is("0 0 E"));

    }


}
