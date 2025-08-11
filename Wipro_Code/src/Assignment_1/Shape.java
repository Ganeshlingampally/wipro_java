package Assignment_1;

public class Shape {

	    public void area(int side) {
	        int area = side * side;
	        System.out.println("Area of Square: " + area);
	    }

	    public void area(int length, int breadth) {
	        int area = length * breadth;
	        System.out.println("Area of Rectangle: " + area);
	    }

	    public void perimeter(int side) {
	        int perimeter = 4 * side;
	        System.out.println("Perimeter of Square: " + perimeter);
	    }

	    public void perimeter(int length, int breadth) {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of Rectangle: " + perimeter);
	    }
	

	    public static void main(String[] args) {
	        Shape shape = new Shape();

	        int squareSide = 5;
	        shape.area(squareSide);
	        shape.perimeter(squareSide);

	        int length = 7, breadth = 4;
	        shape.area(length, breadth);
	        shape.perimeter(length, breadth);
	    }
	}

