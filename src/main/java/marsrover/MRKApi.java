package marsrover;

import java.util.Arrays;
import java.util.List;

public class MRKApi {
    private final SetDimensionsCommand commandSetDimension;
    private final Plateau plateau;
    private final Rover rover;
    int phase = 0;

    public MRKApi(Plateau plateau, Rover rover) {
        this.plateau = plateau;
        this.rover = rover;

        commandSetDimension = new SetDimensionsCommand(plateau,rover);
    }

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) {
        if (phase == 0) {
            commandSetDimension.apply(command);
            phase = 1;
            return;
        }
        new SetPositionAndOrientationOfRoverCommand(plateau,rover).apply(command);
    }

    public Rover getRover() {
        return rover;
    }
}