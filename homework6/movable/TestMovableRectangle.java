package homework6.movable;

public class TestMovableRectangle {

	public static void main(String[] args) {
        
		Movable rectangle = new MovableRectangle(2, 11, 5, 13, 7, 8);
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
	}

}
