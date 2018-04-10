package marsrover;

public class Rover {
    private String orientation = "W";
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
