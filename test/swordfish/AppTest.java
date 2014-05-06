package swordfish;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    @Test
    public void shouldTellRoverToPrintStatus() throws Exception {

        MarsRover mockMarsRover = mock(MarsRover.class);
        App app = new App(mockMarsRover);

        app.start();

        verify(mockMarsRover).printStatus();

    }

    @Test
    public void shouldTellRoverToMove() throws Exception {

        MarsRover mockMarsRover = mock(MarsRover.class);
        App app = new App(mockMarsRover);

        app.start();

        verify(mockMarsRover).move();

    }
}
