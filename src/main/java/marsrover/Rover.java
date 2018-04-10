package marsrover;

public class Rover {
    private String orientation = "W";

    public void setOrientation(String orientation)
    {
        this.orientation = orientation;
    }

    public Rover() {
    }

    public String getOrientation() {
        return orientation;
    }
}
