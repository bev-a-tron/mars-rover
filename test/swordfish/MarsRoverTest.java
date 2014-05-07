package swordfish;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {

        int[] initialPosition = new int[]{0, 0};
        String initialDirection = "N";
        this.rover = new MarsRover(initialPosition, initialDirection);

    }

    @Test
    public void shouldMove() throws Exception {

        assertThat(rover.start("MMM"), is("0 3 N"));

    }


    @Ignore("TODO #3 | Beverly | implementation for rotateRight looks too ugly, reading clean code for now")
    @Test
    public void shouldRotateToTheRight() throws Exception {

        rover.rotateRight();

        assertThat(rover.start("RRR"), is("0 0 W"));

    }

}
