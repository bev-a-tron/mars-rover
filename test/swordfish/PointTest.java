package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void shouldSumTwoPoints() throws Exception {

        Point point = new Point(0, 1);
        Point anotherPoint = new Point(1, 1);

        assertThat(point.plus(anotherPoint), is(new Point(1, 2)));

    }
}
