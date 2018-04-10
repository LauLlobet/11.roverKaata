package marsrover;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MarsRoverShould {

    private MarsRover marsRover;

    @Before
    public void before() {
        marsRover = new MarsRover();
    }

    @Test
    public void
    be_created_with_a_board_size() {
        marsRover.applyCommand("5 4");

        assertThat(marsRover.getPlateauWidth(),is(5));
        assertThat(marsRover.getPlateauHeight(),is(4));

        marsRover = new MarsRover();

        marsRover.applyCommand("6 5");

        assertThat(marsRover.getPlateauWidth(),is(6));
        assertThat(marsRover.getPlateauHeight(),is(5));
    }

    @Test
    public void
    orient_the_rover_at_four_directions() {
        marsRover.applyCommand("5 4");
        marsRover.applyCommand("1 2 N");

        Rover rover = marsRover.getRover();
        assertThat(rover.getOrientation(),is("N"));

        marsRover = new MarsRover();

        marsRover.applyCommand("5 5");
        marsRover.applyCommand("1 2 E");
        rover = marsRover.getRover();

        assertThat(rover.getOrientation(),is("E"));
    }

}

