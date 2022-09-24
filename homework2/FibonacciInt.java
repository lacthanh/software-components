package homework2;

public class FibonacciInt {

	public static void main(String[] args) {
        int f0 = 0;
        int f1 = 1;
        int i;
        for(i = 2; Integer.MAX_VALUE - f1 > f0 ; i++) {
            int fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            System.out.printf("F(%d) = %d\n",(i-2), f0);
        }
        System.out.printf("F(%d) = %d \n", (i-2), f1);
        System.out.printf("F(%d) is out of range", (i-1));
	}

}
