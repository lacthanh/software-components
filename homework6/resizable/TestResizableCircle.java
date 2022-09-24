package homework6.resizable;

public class TestResizableCircle {

	public static void main(String[] args) {
        
		GeometricObject resizableCircle = new ResizableCircle(7);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        ((ResizableCircle) resizableCircle).resize(11);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
	}

}
