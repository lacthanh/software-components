package homework6.movable;

public class TestMovableCircle {

	public static void main(String[] args) {
        
		Movable circle = new MovableCircle(6, 8, 7, 11, 13);
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);	
	}

}
