package swordfish;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MarsRoverTest {

    @Test
    public void shouldStandStill() throws Exception {

        MarsRover rover = new MarsRover("0,0,N");
        PrintStream mockPrintStream = mock(PrintStream.class);

        rover.printStatus(mockPrintStream);

        verify(mockPrintStream).println("0,0,N");

    }

    @Test
    public void shouldStandStillFacingSouth() throws Exception {

        MarsRover rover = new MarsRover("0,0,S");
        PrintStream mockPrintStream = mock(PrintStream.class);

        rover.printStatus(mockPrintStream);

        verify(mockPrintStream).println("0,0,S");

    }

}
