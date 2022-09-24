package homework2;

public class FactorialRecusive {

	public static void main(String[] args) {
        int n = 10;
        System.out.printf("Factorial of %d is %d", n, factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) 
        	return 1; 
        return (n * factorial(n-1));
	}

}
