package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void shouldMoveNorth() {

        MarsRover rover = new MarsRover(0, 0, "N");

        assertThat(rover.start("MMM"), is("0 3 N"));

    }

    @Test
    public void shouldMoveEast() {

        MarsRover rover = new MarsRover(0, 0, "E");

        assertThat(rover.start("MMM"), is("3 0 E"));

    }

    @Test
    public void shouldRotateToTheRight() {

        MarsRover rover = new MarsRover(0, 0, "N");

        assertThat(rover.start("RRR"), is("0 0 W"));

    }

    @Test
    public void shouldRotateToTheLeft() {

        MarsRover rover = new MarsRover(0, 0, "N");

        assertThat(rover.start("LLL"), is("0 0 E"));

    }


}
