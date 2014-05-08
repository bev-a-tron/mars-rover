package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DirectionTest {

    @Test
    public void shouldIncrement() throws Exception {

        Direction direction = new Direction("N");

        direction.plus(1);

        assertThat(direction.cardinalDirection, is("E"));

    }


    @Test
    public void shouldIncrementFromEast() throws Exception {

        Direction direction = new Direction("E");

        direction.plus(1);

        assertThat(direction.cardinalDirection, is("S"));

    }
}
