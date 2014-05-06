package swordfish;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MarsRoverTest {

    @Test
    public void shouldPrintStatus() throws Exception {

        PrintStream mockPrintStream = mock(PrintStream.class);
        MarsRover rover = new MarsRover("0,0,N", mockPrintStream);

        rover.printStatus();

        verify(mockPrintStream).println("0,0,N");

    }

}
