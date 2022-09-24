package homework3.point;

public class ArrayMyPoint {

	public static void main(String[] args) {
		MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
        }
        for (MyPoint elem : points) {
            System.out.println(elem);
        }
	}
}
