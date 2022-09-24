package homework2;

public class GDC {
	
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        System.out.printf("gcd(%d,%d) is %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
