package marsrover;

abstract class Command {
    protected Rover rover;
    protected Plateau plateau;
    protected String[] parts;

    public Command(Plateau plateau, Rover rover) {
      this.plateau = plateau;
      this.rover = rover;
    }

    public void apply(String command){
        parts = command.split(" ");
        applyOnParts();
    }

    public abstract void applyOnParts();

}
