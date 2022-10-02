package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private int longSide;
    private int shortSide;
    private final String name = "Rectangle";

    public Rectangle(int longSide, int shortSide, Color color) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {

        return longSide * shortSide;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, LongSide: "
                + longSide + ", ShortSide: " + shortSide + ", color: " + getColor());
    }
}
