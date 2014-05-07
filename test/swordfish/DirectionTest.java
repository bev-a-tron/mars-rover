package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DirectionTest {

    @Test
    public void shouldMapToPoint() throws Exception {

        assertThat(Direction.NORTH, is(new Point(0, 1)));
        assertThat(Direction.SOUTH, is(new Point(0, -1)));
        assertThat(Direction.EAST, is(new Point(1, 0)));
        assertThat(Direction.WEST, is(new Point(-1, 0)));

    }
}
