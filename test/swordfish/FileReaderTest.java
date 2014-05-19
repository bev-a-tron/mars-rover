package swordfish;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

    @Test
    public void shouldReadInFile() throws Exception {

        String fileName = "/Users/balau/Beach/MarsRover/src/swordfish/data.txt";

        String data = FileReader.read(fileName);

        assertEquals("5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM", data);

    }
}