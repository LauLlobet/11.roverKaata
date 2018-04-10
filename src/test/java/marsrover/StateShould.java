package marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StateShould {
    private State1 state;
    private Command intialCommand;
    private Command finalCommand;

    @Before
    public void setUp(){
        state = new State1();
        intialCommand = new Command();
        finalCommand = new Command();
        state.putCommand("initial",intialCommand);
    }
    @Test
    public void
    return_added_commands_by_giving_state() {

        assertThat(state.getCommandFrom("initial"),is(intialCommand));
    }

    @Test
    public void
    link_states_between_them() {

        state.putCommand("final",finalCommand);
        state.setNextState("initial","final");
        assertThat(state.getNextState("initial"),is("final"));
    }
}
