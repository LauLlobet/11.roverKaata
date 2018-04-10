package marsrover;

//NO ESTA EN EL DOMINI

public class SetDimensionsCommand extends Command{

    SetDimensionsCommand(Plateau plateau, Rover rover) {
        super(plateau,rover);
    }

    public void applyOnParts() {
        plateau.setPlateauDimensions(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}
