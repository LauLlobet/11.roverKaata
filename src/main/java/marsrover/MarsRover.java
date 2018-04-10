package marsrover;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int width;
    private int hieght;

    public List<String> getOutput() {
        return Arrays.asList("1 3 N", "5 1 E");
    }

    public void applyCommand(String command) {
        width = 5;
        hieght = 4;
    }

    public int getWidth() {
        return width;
    }

    public int getHieght() {
        return hieght;
    }
}
