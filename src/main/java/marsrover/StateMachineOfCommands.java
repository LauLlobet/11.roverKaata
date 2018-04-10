package marsrover;

import java.util.HashMap; // NO ESTA EN EL DOMAIN

public class StateMachineOfCommands extends HashMap<String,Command> {
    private HashMap<String, String> transitions = new HashMap<String, String>();
    private String actualState = "initial";

    public Command getCommandFrom(String state) {
        return this.get(state);
    }

    public void putCommand(String state, Command command) {
        this.put(state,command);
    }

    public void setTransition(String origin, String destiny) {
        this.transitions.put(origin,destiny);
    }

    public String getNextState(String origin) {
        return transitions.get(origin);
    }

    public Command getActualCommand() {
        return getCommandFrom(actualState);
    }

    public void nextState() throws Exception{
        if(!transitions.containsKey(actualState)){
            throw new ActualStateHasNoTransition();
        }
        actualState = transitions.get(actualState);
    }
}
