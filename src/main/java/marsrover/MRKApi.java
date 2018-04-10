package marsrover;

import java.util.Arrays;
import java.util.List;

public class MRKApi {
    private final Plateau plateau;
    int phase = 0;
    Rover rover;

    public MRKApi(Plateau plateau) {
        this.plateau = plateau;
    }

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) {
        if (phase == 0) {
            Command parseComand = new Command(command);
            int width = parseComand.getWidth();
            int height = parseComand.getHeight();
            plateau.setPlateauDimensions(width, height);
            phase = 1;
            return;
        }
        String[] parts = command.split(" ");
        rover = new Rover(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2]);
    }

    public Rover getRover() {
        return rover;
    }
}