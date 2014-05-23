package swordfish;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void shouldFollowInputInstructionsForOneRover() {

        String input = "5 5\n1 2 N\nLMLMLMLMM";
        App app = new App(input);

        List finalPosition = app.start();

        List<String> answer = new ArrayList<String>(Arrays.asList("1 3 N"));
        assertEquals(answer, finalPosition);

    }

    @Test
    public void shouldFollowInputInstructionsForTwoRovers() {

        String input = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        App app = new App(input);

        List finalPosition = app.start();

        List<String> answer = new ArrayList<String>(Arrays.asList("1 3 N", "5 1 E"));

        assertEquals(answer, finalPosition);

    }

}
