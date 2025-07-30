package Assignment;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();

        int squareSide = 5;
        int rectLength = 8;
        int rectBreadth = 4;

        shape.area(squareSide);
        shape.perimeter(squareSide);

        System.out.println();

        shape.area(rectLength, rectBreadth);
        shape.perimeter(rectLength, rectBreadth);
    }
}

