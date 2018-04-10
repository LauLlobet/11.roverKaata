package marsrover;

public class Plateau { // DEFINE ok
    private int plateauWidth;
    private int plateauHeight;

    public void setPlateauDimensions(int width, int height) {
        plateauWidth = width;
        plateauHeight = height;
    }

    public int getPlateauWidth() {
        return plateauWidth;
    }

    public int getPlateauHeight() {
        return plateauHeight;
    }
}
