package homework2;

public class FibonacciRecusive {
	
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("F(%d) is %d", n, fibonacci(n));
    }

    public static int fibonacci(int n) {
        return (n == 0) ? 0 : (n == 1) ? 1 : (fibonacci(n - 1) + fibonacci(n - 2));
    }
}
