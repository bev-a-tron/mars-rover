package swordfish;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MarsRoverTest {

    private PrintStream mockPrintStream;
    private int[] initialPosition;
    private String initialDirection;
    private MarsRover rover;

    @Before
    public void setUp() throws Exception {

        this.mockPrintStream = mock(PrintStream.class);
        this.initialPosition = new int[]{0, 0};
        this.initialDirection = "N";
        this.rover = new MarsRover(initialPosition, initialDirection, mockPrintStream);

    }

    @Test
    public void shouldFormatAndPrintStatus() throws Exception {

        rover.printStatus();

        verify(mockPrintStream).println("0 0 N");

    }

    @Ignore("#2 | Beverly | WIP implementing move forward story")
    @Test
    public void shouldMoveForwardOneSpace() throws Exception {

        rover.printStatus();

        verify(mockPrintStream).println("0 1 N");

    }
}
