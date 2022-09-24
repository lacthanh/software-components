package homework3.point;

public class TestMyCircle {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);

        MyCircle circle1 = new MyCircle();
        System.out.println(circle1);
        
        MyCircle circle2 = new MyCircle(point1, 5);
        MyCircle circle3 = new MyCircle(6, 7, 8);
        
        circle2.setRadius(9);
        System.out.println(circle2.getRadius());

        System.out.println(circle1.getCenter());
        circle1.setCenter(point2);
        System.out.println(circle1.getCenter());

        System.out.println(circle3.getCenterX());
        circle3.setCenterX(10);
        System.out.println(circle3.getCenterX());

        System.out.println(circle2.getCenterY());
        circle2.setCenterY(11);
        System.out.println(circle2.getCenterY());

        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);
        circle1.setCenterXY(12, 13);
        System.out.println(circle1.getCenterXY()[0]);
        System.out.println(circle1.getCenterXY()[1]);

        System.out.println(circle3.getArea());
        System.out.println(circle2.getCircumference());
        System.out.println(circle1.distance(circle3));		
	}

}
