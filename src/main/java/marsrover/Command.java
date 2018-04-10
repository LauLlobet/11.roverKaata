package marsrover;

class Command {
    private String command;
    private int width;
    private int height;

    public Command(String command) {
        this.command = command;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Command invoke() {
        String[] parts = command.split(" ");
        width = Integer.parseInt(parts[0]);
        height = Integer.parseInt(parts[1]);
        return this;
    }
}
