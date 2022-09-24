package homework5.point;

public class TestMain {

	public static void main(String[] args) {
		
		Point2D point2D = new Point2D(1, 2);
		System.out.println(point2D);
		
		Point3D point3D = new Point3D(3, 4, 5);
		System.out.println(point3D);
		
		MovablePoint movablePoint = new MovablePoint(6, 7, 8, 9);
		System.out.println(movablePoint);
		movablePoint.move();
		System.out.println(movablePoint);
	}

}
