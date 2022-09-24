package homework4.polynomial;

public class TestMyPolynomial {

	public static void main(String[] args) {
		
        MyPolynomial polynomial1 = new MyPolynomial(1.2, 3.4, 5.6, 7.8);
        double[] coeffs = {8.9, 9.1, 10.11, 11.12};
        MyPolynomial polynomial2 = new MyPolynomial(coeffs);

        System.out.println(polynomial1);
        System.out.println(polynomial2);
        polynomial1.getDegree();
        System.out.println(polynomial1.add(polynomial2));
        polynomial2.add(polynomial2);
        System.out.println(polynomial2);
        System.out.println(polynomial1.multiply(polynomial2));
	}

}
