package homework6.geometric_object;

public class Rectangle implements GeometricObject {
    
	private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,length=%.2f]", width, length);
    }
}

