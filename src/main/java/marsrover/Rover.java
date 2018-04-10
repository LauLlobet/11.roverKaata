package marsrover;

public class Rover {
    private String orientation = "W"; //SPIN si MOVE no
    Rover() {
    }

    public void setOrientation(String orientation)
    {
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }
}
