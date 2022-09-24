package homework5.circle_cylinder_composition;

public class TestCylinder {

	public static void main(String[] args) {
        
		Cylinder cylinder1 = new Cylinder();
        System.out.println("Radius is " + cylinder1.getBase().getRadius()
                + ", Height is " + cylinder1.getHeight()
                + ", Color is " + cylinder1.getBase().getColor()
                + ", Base area is " + cylinder1.getBase().getArea()
                + ", Volume is " + cylinder1.getVolume()
                + ", surface area=" + cylinder1.getArea());

        Circle circle = new Circle(3);
        cylinder1.setBase(circle);
        System.out.println("Radius is " + cylinder1.getBase().getRadius()
                + ", Height is " + cylinder1.getHeight()
                + ", Color is " + cylinder1.getBase().getColor()
                + ", Base area is " + cylinder1.getBase().getArea()
                + ", Volume is " + cylinder1.getVolume()
                + ", surface area=" + cylinder1.getArea());

        Cylinder cylinder2 = new Cylinder(circle, 5);
        System.out.println("Radius is " + cylinder2.getBase().getRadius()
                + ", Height is " + cylinder2.getHeight()
                + ", Color is " + cylinder2.getBase().getColor()
                + ", Base area is " + cylinder2.getBase().getArea()
                + ", Volume is " + cylinder2.getVolume()
                + ", surface area=" + cylinder2.getArea());

        Cylinder cylinder3 = new Cylinder(7, 9);
        System.out.println("Radius is " + cylinder3.getBase().getRadius()
                + ", Height is " + cylinder3.getHeight()
                + ", Color is " + cylinder3.getBase().getColor()
                + ", Base area is " + cylinder3.getBase().getArea()
                + ", Volume is " + cylinder3.getVolume()
                + ", surface area=" + cylinder3.getArea());
	}

}
