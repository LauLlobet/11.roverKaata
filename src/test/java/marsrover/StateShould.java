package marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StateShould {
    private StateMachineOfCommands state;
    private Command intialCommand;
    private Command finalCommand;

    @Before
    public void setUp(){
        state = new StateMachineOfCommands();
        intialCommand = new Command();
        finalCommand = new Command();
        state.putCommand("initial",intialCommand);
        state.putCommand("final", finalCommand);
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
        state.setTransition("initial","final");
        assertThat(state.getNextState("initial"),is("final"));
    }

    @Test
    public void
    change_state_and_provide_its_commads() throws Exception {
        state.setTransition("initial","final");
        state.setTransition("final","initial");

        state.nextState();

       assertThat(state.getActualCommand(),is(finalCommand));

       state.nextState();

       assertThat(state.getActualCommand(),is(intialCommand));
    }
}
