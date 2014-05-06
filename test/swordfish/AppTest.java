package swordfish;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTest {

    @Test
    public void shouldPrintStatus() throws Exception {

        PrintStream printStream = mock(PrintStream.class);
        MarsRover mockMarsRover = mock(MarsRover.class);
        App app = new App(mockMarsRover, printStream);

        app.start();

        verify(mockMarsRover).printStatus(printStream);

    }


}
