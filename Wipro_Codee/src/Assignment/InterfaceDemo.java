package Assignment;

public class InterfaceDemo {

    // Interface 1: Drawable
    interface Drawable {
        void drawingColor();
        void thickness();
    }

    // Interface 2: Fillable
    interface Fillable {
        void fillingColor();
        void size();
    }

    // Class: Line
    static class Line implements Drawable, Fillable {
        @Override
        public void drawingColor() {
            System.out.println("Line Drawing Color: Black"); // Output: Line Drawing Color: Black
        }

        @Override
        public void thickness() {
            System.out.println("Line Thickness: 2px"); // Output: Line Thickness: 2px
        }

        @Override
        public void fillingColor() {
            System.out.println("Line Fill Color: None"); // Output: Line Fill Color: None
        }

        @Override
        public void size() {
            System.out.println("Line Size: 100px long"); // Output: Line Size: 100px long
        }
    }

    // Class: Circle
    static class Circle implements Drawable, Fillable {
        @Override
        public void drawingColor() {
            System.out.println("Circle Drawing Color: Red"); // Output: Circle Drawing Color: Red
        }

        @Override
        public void thickness() {
            System.out.println("Circle Thickness: 4px"); // Output: Circle Thickness: 4px
        }

        @Override
        public void fillingColor() {
            System.out.println("Circle Fill Color: Blue"); // Output: Circle Fill Color: Blue
        }

        @Override
        public void size() {
            System.out.println("Circle Size: Radius 50px"); // Output: Circle Size: Radius 50px
        }
    }

    // Class: Square
    static class Square implements Drawable, Fillable {
        @Override
        public void drawingColor() {
            System.out.println("Square Drawing Color: Green"); // Output: Square Drawing Color: Green
        }

        @Override
        public void thickness() {
            System.out.println("Square Thickness: 3px"); // Output: Square Thickness: 3px
        }

        @Override
        public void fillingColor() {
            System.out.println("Square Fill Color: Yellow"); // Output: Square Fill Color: Yellow
        }

        @Override
        public void size() {
            System.out.println("Square Size: 100px x 100px"); // Output: Square Size: 100px x 100px
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("=== Line Details ===");
        Line line = new Line();
        line.drawingColor();
        line.thickness();
        line.fillingColor();
        line.size();

        System.out.println("\n=== Circle Details ===");
        Circle circle = new Circle();
        circle.drawingColor();
        circle.thickness();
        circle.fillingColor();
        circle.size();

        System.out.println("\n=== Square Details ===");
        Square square = new Square();
        square.drawingColor();
        square.thickness();
        square.fillingColor();
        square.size();
    }
}

