public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   WEEK 6 LAB: INTERFACES & MULTIPLE INHERITANCE  ");
        System.out.println("==================================================");

        Circle circle = new Circle("Red", new Point(0, 0), 4.0);
        Rectangle rect = new Rectangle("Blue", new Point(2, 5), 6.0, 3.0);

        // 1. Polymorphic Interface Processing (Drawable)
        System.out.println("\n[1] Polymorphic Invocation via Drawable Interface:");
        Drawable[] drawables = new Drawable[] { circle, rect };
        for (Drawable d : drawables) {
            d.draw(); // Dynamic interface method invocation
        }

        // 2. Resizing Objects via Resizable Interface
        System.out.println("\n[2] Scaling Dimensions via Resizable Interface:");
        System.out.printf("Original Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Original Rectangle Area: %.2f%n", rect.calculateArea());

        Resizable[] resizables = new Resizable[] { circle, rect };
        double scaleFactor = 1.5;
        System.out.printf("%nApplying scale factor of %.1fx to all resizables...%n", scaleFactor);
        for (Resizable r : resizables) {
            r.resize(scaleFactor);
        }

        System.out.printf("Scaled Circle Area: %.2f (Expected: ~113.10)%n", circle.calculateArea());
        System.out.printf("Scaled Rectangle Area: %.2f (Expected: 40.50)%n", rect.calculateArea());

        // 3. Re-drawing after modification
        System.out.println("\n[3] Rendering Scaled Shapes:");
        for (Drawable d : drawables) {
            d.draw();
        }

        // 4. Invariant Guard Checks on Interfaces
        System.out.println("\n[4] Invariant Validation Tests:");
        try {
            System.out.println("Attempting negative resize factor (-0.5)...");
            circle.resize(-0.5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Expected Guard: " + e.getMessage());
        }
    }
}