package swordfish;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MarsRoverTest {

    private PrintStream mockPrintStream;
    private MarsRover rover;

    @Before
    public void setUp() throws Exception {

        this.mockPrintStream = mock(PrintStream.class);
        int[] initialPosition = new int[]{0, 0};
        String initialDirection = "N";
        this.rover = new MarsRover(initialPosition, initialDirection, mockPrintStream);

    }

    @Test
    public void shouldFormatAndPrintStatus() throws Exception {

        rover.printStatus();

        verify(mockPrintStream).println("0 0 N");

    }

    @Test
    public void shouldMoveForwardOneSpace() throws Exception {

        rover.move();
        rover.printStatus();

        verify(mockPrintStream).println("0 1 N");

    }
}
