package marsrover;

abstract class Command {
    Rover rover;
    Plateau plateau;
    String[] parts;

    Command(Plateau plateau, Rover rover) {
      this.plateau = plateau;
      this.rover = rover;
    }

    public void apply(String command){
        parts = command.split(" ");
        applyOnParts();
    }

    public abstract void applyOnParts();

}
