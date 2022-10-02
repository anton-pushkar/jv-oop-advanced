package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    private int side;
    private final String name = "Square";

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq.units, side: " + side + ", color: " + getColor());
    }

}
