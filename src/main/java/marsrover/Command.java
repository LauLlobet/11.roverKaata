package marsrover;

class Command {
    private String command;
    private int width;
    private int height;

    public Command(String command) {
        this.command = command;
        String[] parts = command.split(" ");
        width = Integer.parseInt(parts[0]);
        height = Integer.parseInt(parts[1]);
    }

    public Command() {
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
