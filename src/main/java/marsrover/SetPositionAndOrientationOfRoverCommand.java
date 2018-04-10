package marsrover;

public class SetPositionAndOrientationOfRoverCommand extends Command{
    public SetPositionAndOrientationOfRoverCommand(Plateau plateau, Rover rover) {
        super(plateau, rover);
    }

    public void applyOnParts() {
        rover.setOrientation(parts[2]);

    }
}
