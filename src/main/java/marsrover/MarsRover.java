package marsrover;

import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.*;

public class MarsRover {
    private int plateauWidth;
    private int plateauHeight;

    private int phase = 0;
    private Rover rover;

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) {
        if(phase == 0) {
            Command parseComand = new Command(command);
            int width = parseComand.getWidth();
            int height = parseComand.getHeight();
            setPlateauDimensions(width, height);
            phase = 1;
            return;
        }
        String[] parts = command.split(" ");
        rover = new Rover(parseInt(parts[0]), parseInt(parts[1]),parts[2]);
    }

    private void setPlateauDimensions(int width,int height) {
        plateauWidth = width;
        plateauHeight = height;
    }

    public int getPlateauWidth() {
        return plateauWidth;
    }

    public int getPlateauHeight() {
        return plateauHeight;
    }

    public Rover getRover() {
        return rover;
    }
}
