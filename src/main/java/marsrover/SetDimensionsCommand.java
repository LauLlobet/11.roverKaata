package marsrover;

public class SetDimensionsCommand extends Command{

    public SetDimensionsCommand(Plateau plateau, Rover rover) {
        super(plateau,rover);
    }

    public void applyOnParts() {
        plateau.setPlateauDimensions(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}
