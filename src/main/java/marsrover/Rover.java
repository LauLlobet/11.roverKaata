package marsrover;

public class Rover {
    private final String orientation;

    public Rover(int x, int y, String orientation) {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }
}
