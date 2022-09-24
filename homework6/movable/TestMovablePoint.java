package homework6.movable;

public class TestMovablePoint {

	public static void main(String[] args) {
        
		Movable point = new MovablePoint(17, 6, 11, 8);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
	}

}
