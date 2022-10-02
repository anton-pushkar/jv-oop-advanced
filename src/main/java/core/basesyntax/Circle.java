package core.basesyntax;

public class Circle extends Figure implements Area, Draw {
    private int radius;
    private final String name = "Circle";

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void infoDrawer() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, radius: "
                + radius + ", color: " + getColor());
    }
}