package swordfish;

import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MarsRoverTest {

    @Test
    public void shouldFormatAndPrintStatus() throws Exception {

        PrintStream mockPrintStream = mock(PrintStream.class);
        int[] initialPosition = {0, 0};
        String initialDirection = "N";
        MarsRover rover = new MarsRover(initialPosition, initialDirection, mockPrintStream);

        rover.printStatus();

        verify(mockPrintStream).println("0 0 N");

    }

    @Ignore("#2 | Beverly | TODO: working on functional test")
    @Test
    public void shouldMoveForwardOneSpace() throws Exception {

        PrintStream mockPrintStream = mock(PrintStream.class);
        int[] initialPosition = {0, 0};
        String initialDirection = "N";
        MarsRover rover = new MarsRover(initialPosition, initialDirection, mockPrintStream);

        rover.printStatus();

        verify(mockPrintStream).println("0 1 N");

    }
}
