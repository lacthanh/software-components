package homework5.person;

public class TestMain {

	public static void main(String[] args) {
		
		Person person = new Person("Thanh", "Beijing");
		System.out.println(person);
		
		Student student = new Student("Thanh", "Beijing", "standard training", 4, 250);
		System.out.println(student);
		
		Staff staff = new Staff("Phong", "Tianjin", "Thanh Hoa", 15);
		System.out.println(staff);
	}

}
