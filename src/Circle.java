public class Circle extends Shape implements Drawable, Resizable {
    private final Point center;
    private double radius;

    public Circle(String color, Point center, double radius) {
        super(color);
        if (center == null) {
            throw new IllegalArgumentException("Center point cannot be null.");
        }
        if (radius <= 0.0) {
            throw new IllegalArgumentException("Radius must be strictly positive.");
        }
        this.center = new Point(center);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("  -> [Drawing Circle] Color: %s, Center: %s, Radius: %.2f%n",
                getColor(), center, radius);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0.0) {
            throw new IllegalArgumentException("Scaling factor must be strictly positive.");
        }
        this.radius *= factor;
    }

    public Point getCenter() { return new Point(center); }
    public double getRadius() { return radius; }

    @Override
    public String toString() {
        return String.format("Circle[%s, Center=%s, Radius=%.2f, Area=%.2f]",
                super.toString(), center, radius, calculateArea());
    }
}
