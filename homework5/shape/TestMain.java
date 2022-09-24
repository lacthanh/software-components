package homework5.shape;

public class TestMain {

	public static void main(String[] args) {
        
		Shape shape = new Shape();
        System.out.println(shape);
        shape.setColor("white");
        System.out.println(shape);
        shape.setFilled(false);
        System.out.println(shape);
        
        Circle circle = new Circle(5, "blue", false);
        System.out.println(circle);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());  
        
        Rectangle rectangle = new Rectangle(9.1, 14.11, "yellow", false);
        System.out.println(rectangle);
        rectangle.setWidth(6);
        rectangle.setLength(8);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        
        Square square = new Square(7, "green", true);
        System.out.println(square);
        square.setWidth(2);
        square.setLength(4);
        square.setSide(9);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
	}

}
