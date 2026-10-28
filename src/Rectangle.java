public class Rectangle extends Shape implements Drawable, Resizable {
    private final Point topLeft;
    private double width;
    private double height;

    public Rectangle(String color, Point topLeft, double width, double height) {
        super(color);
        if (topLeft == null) {
            throw new IllegalArgumentException("Top-left coordinate cannot be null.");
        }
        if (width <= 0.0 || height <= 0.0) {
            throw new IllegalArgumentException("Dimensions must be strictly positive.");
        }
        this.topLeft = new Point(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.printf("  -> [Drawing Rectangle] Color: %s, TopLeft: %s, Width: %.2f, Height: %.2f%n",
                getColor(), topLeft, width, height);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0.0) {
            throw new IllegalArgumentException("Scaling factor must be strictly positive.");
        }
        this.width *= factor;
        this.height *= factor;
    }

    public Point getTopLeft() { return new Point(topLeft); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public String toString() {
        return String.format("Rectangle[%s, TopLeft=%s, Width=%.2f, Height=%.2f, Area=%.2f]",
                super.toString(), topLeft, width, height, calculateArea());
    }
}