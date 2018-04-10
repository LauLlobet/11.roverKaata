package marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MrkApiShould {

    private Plateau plateau;
    private MRKApi mrkApi;
    private Rover rover;

    @Before
    public void before() {
        plateau = new Plateau();
        rover = new Rover();
        mrkApi = new MRKApi(plateau, rover);
    }

    @Test
    public void
    be_created_with_a_board_size() {
        mrkApi.applyCommand("5 4");

        assertThat(plateau.getPlateauWidth(),is(5));
        assertThat(plateau.getPlateauHeight(),is(4));
    }

    @Test
    public void
    orient_the_rover_at_four_directions() {
        mrkApi.applyCommand("5 4");
        mrkApi.applyCommand("1 2 N");

        assertThat(rover.getOrientation(),is("N"));
    }

}

