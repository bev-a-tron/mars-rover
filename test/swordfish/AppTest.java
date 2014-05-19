package swordfish;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void shouldFollowInputInstructions() {

        String input = "5 5\n0 0 N\nMRMML";
        App app = new App(input);

        List<String> finalPosition = app.calculatePositions();

        List<String> answer = new ArrayList<String>(Arrays.asList("2 1 N"));
        assertThat(finalPosition, is(answer));

    }

    @Test
    public void shouldFollowInputInstructionsForOneRover() {

        String input = "5 5\n1 2 N\nLMLMLMLMM";
        App app = new App(input);

        List<String> finalPosition = app.calculatePositions();

        List<String> answer = new ArrayList<String>(Arrays.asList("1 3 N"));
        assertEquals(answer, finalPosition);

    }

    @Test
    public void shouldGetNumberOfRoversIs2() throws Exception {

        String input = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        App app = new App(input);

        assertThat(app.countRovers(), is(2));

    }

    @Test
    public void shouldGetNumberOfRoversIs3() throws Exception {

        String input = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM\n1 1 W\nRRMMM";
        App app = new App(input);

        assertThat(app.countRovers(), is(3));

    }

    @Test
    public void shouldFollowInputInstructionsForTwoRovers() {

        String input = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
        App app = new App(input);

        List<String> finalPosition = app.calculatePositions();

        List<String> answer = new ArrayList<String>(Arrays.asList("1 3 N", "5 1 E"));

        assertEquals(answer, finalPosition);

    }

}
