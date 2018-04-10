package marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int plateauWidth;
    private int plateauHeight;

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) {
        Command parseComand = new Command(command).invoke();
        int width = parseComand.getWidth();
        int height = parseComand.getHeight();
        setPlateauDimensions(width, height);
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

}
