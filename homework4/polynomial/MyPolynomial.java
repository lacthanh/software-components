package homework4.polynomial;

public class MyPolynomial {
    
	private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        String output = "" + coeffs[0];
        for (int i = 1; i < coeffs.length; i++) {
            if (i == 1)
                output = coeffs[i] + "x" + " + " + output;
            else
                output = coeffs[i] + "x^" + i + " + " + output;
        }
        return output;
    }

    public double evaluate(double x) {
        double sum = coeffs[0];
        double item = 1.0;
        for (int i = 1; i < coeffs.length; i++) {
            item *= x;
            sum += coeffs[1] * item;
        }
        return sum;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public MyPolynomial add(MyPolynomial right) {
        double[][] array = {coeffs, right.getCoeffs()};
        int maxDeg = Math.max(array[0].length, array[1].length);
        int maxDegAvai = Math.min(array[0].length, array[1].length);
        int longerArray = (array[0].length > array[1].length) ? 0 : 1;
        double[] result = new double[maxDeg];
        for (int i = 0; i < maxDegAvai; i++) {
            result[i] = array[0][i] + array[1][i];
        }
        for (int i = maxDegAvai; i < maxDeg; i++) {
            result[i] = array[longerArray][i];
        }
        coeffs = result;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] resultCoeffs = new double[coeffs.length + right.getDegree()];
        double[] anotherCoeffs = right.getCoeffs();
        double temp = 0.0;
        for (int i = 0; i < resultCoeffs.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > coeffs.length - 1) {
                    continue;
                }
                if (i - j > anotherCoeffs.length - 1) {
                    continue;
                }
                temp += coeffs[j] * anotherCoeffs[i - j];
            }
            resultCoeffs[i] = temp;
        }
        coeffs = resultCoeffs;
        return this;
    }
}
