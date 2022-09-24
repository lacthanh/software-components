package homework3.point;

public class TestMyRectangle {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint(1, 3);
        MyPoint point2 = new MyPoint(5, 1);
        
        MyRectangle rectangle1 = new MyRectangle(point1, point2);
        System.out.println(rectangle1);

        MyRectangle rectangle2 = new MyRectangle(5, 6, 7, 8);
        System.out.println(rectangle2);

        System.out.println("perimeter is: " + rectangle1.getPerimeter());
        System.out.println("area is: " + rectangle2.getArea());		
	}

}
