package homework2;

public class GDCRecursive {
	
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        System.out.printf("gcd(%d,%d) is %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
        	return a;
        } else if (b == 0) {
        	return b;
        } else if (a == b) {
        	return a;
        } else {
        	return (a > b) ? gcd((a - b), b) : gcd(a, (b - a));
        }
    }
}
