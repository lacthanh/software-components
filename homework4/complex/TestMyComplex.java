package homework4.complex;

public class TestMyComplex {

	public static void main(String[] args) {

        MyComplex complex1 = new MyComplex();
        MyComplex complex2 = new MyComplex(1.2, 3.4);

        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex2.getReal());
        complex1.setReal(5.6);
        System.out.println(complex1);
        System.out.println(complex1.isReal());

        System.out.println(complex2.getReal());

        System.out.println(complex2);
        System.out.println(complex2.isImagine());

        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println(complex1.hasEquals(complex2));
        System.out.println(complex2.hasEquals(1.2, 3.4));

        System.out.println(complex1.magnitude());
        complex2.setValue(7.8, 9.1);
        System.out.println(complex2.argument());
        System.out.println(complex2.conjugate());

        System.out.println(complex1.add(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.addNew(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.subtractNew(complex2));
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.multiply(complex2));
        System.out.println(complex2.divide(complex1));
	}

}
