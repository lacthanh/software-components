package homework3.point;

public class TestMyTriangle {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);
        MyPoint point3 = new MyPoint(5, 6);

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        System.out.println(triangle1);
        System.out.println("perimeter is: " + triangle1.getPerimeter());

        MyTriangle triangle2 = new MyTriangle(7, 8, 9, 10, 11, 12);
        System.out.println("type is: " + triangle1.getType());
        System.out.println("type is: " + triangle2.getType());		
	}

}
