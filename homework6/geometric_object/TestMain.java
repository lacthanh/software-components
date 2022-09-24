package homework6.geometric_object;

public class TestMain {

	public static void main(String[] args) {
        
		GeometricObject circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject rectangle = new Rectangle(7, 11);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
	}

}
