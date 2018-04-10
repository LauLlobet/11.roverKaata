package marsrover;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarsRoverShould {

    @Test
    public void
    be_created_with_a_board_size() {
        MarsRover marsRover = new MarsRover();

        marsRover.applyCommand("5 4");

        assertThat(marsRover.getWidth(),is(5));
        assertThat(marsRover.getHieght(),is(4));
    }
}
