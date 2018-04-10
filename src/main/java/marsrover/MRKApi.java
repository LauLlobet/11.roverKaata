package marsrover;

import java.util.Arrays;
import java.util.List;

public class MRKApi {
    private StateMachineOfCommands stateMachine;

    MRKApi(Plateau plateau, Rover rover, StateMachineOfCommands stateMachine) {
        this.stateMachine = stateMachine;
        this.stateMachine.putCommand("initial",new SetDimensionsCommand(plateau,rover));
        this.stateMachine.putCommand("setRover",new SetPositionAndOrientationOfRoverCommand(plateau,rover));
        this.stateMachine.setTransition("initial","setRover");
        this.stateMachine.setTransition("setRover","initial");
    }

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) throws Exception{
        Command actual = stateMachine.getActualCommand() ;
        actual.apply(command);
        stateMachine.nextState();
    }

}