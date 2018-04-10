package marsrover;

import java.util.HashMap;

public class State1 extends HashMap<String,Command> {
    private HashMap<String, String> transitions = new HashMap<String, String>();

    public Command getCommandFrom(String state) {
        return this.get(state);
    }

    public void putCommand(String state, Command command) {
        this.put(state,command);
    }

    public void setNextState(String origin, String destiny) {
        this.transitions.put(origin,destiny);
    }

    public String getNextState(String origin) {
        return transitions.get(origin);
    }
}
