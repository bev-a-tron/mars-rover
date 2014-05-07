package swordfish;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class AppTest {

    private MarsRover mockMarsRover;
    private App app;

    @Before
    public void setUp() throws Exception {

        this.mockMarsRover = mock(MarsRover.class);
        this.app = new App(mockMarsRover);

    }

    @Test
    public void shouldParseAListOfInput() throws Exception {
        String input = "MMMRRLLLL";
        app.start(input);
        verify(mockMarsRover, times(3)).move();
        verify(mockMarsRover, times(2)).rotateRight();
        verify(mockMarsRover, times(4)).rotateLeft();

    }

    @Test
    public void shouldTellRoverToPrintStatus() throws Exception {
        String input = "M";
        app.start(input);
        verify(mockMarsRover).printStatus();

    }

    @Test
    public void shouldTellRoverToMove() throws Exception {
        String input = "M";
        app.start(input);
        verify(mockMarsRover).move();

    }
}
