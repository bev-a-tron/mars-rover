package swordfish;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void shouldFollowInputInstructions() {

        App app = new App();
        String data = "5 5\n0 0 N\nMRMML";

        String finalPosition = app.start(data);

        assertThat(finalPosition, is("2 1 N"));
    }
}
