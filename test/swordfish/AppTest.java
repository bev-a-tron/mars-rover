package swordfish;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    private MarsRover mockMarsRover;

    @Before
    public void setUp() throws Exception {

        this.mockMarsRover = mock(MarsRover.class);
        App app = new App(mockMarsRover);

        app.start();

    }

    @Test
    public void shouldTellRoverToPrintStatus() throws Exception {

        verify(mockMarsRover).printStatus();

    }

    @Test
    public void shouldTellRoverToMove() throws Exception {

        verify(mockMarsRover).move();

    }
}
