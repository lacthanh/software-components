package homework2;

public class TribonacciInt {

	public static void main(String[] args) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int i;
        for (i = 3; Integer.MAX_VALUE - t2 > t1; i++) {
            int tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
            System.out.printf("T(%d) = %d\n", (i - 3), t0);
        }
        System.out.printf("T(%d) = %d\n", (i - 2), t1);
        System.out.printf("T(%d) is out of range", (i - 1));
	}

}
