public class LoopsWarmup {

	public static void main(String[] args) {
		// int n = 5;
		// int x = 1;
		// exponent(2,3);
		// sum(5, 1);
		factorial(1, 5);

	}

	// public static int sum(int sum, int n) {
	// 	int sum = 1;
	// 	for (int i=1; i <=n; i++) {
	// 		sum=sum + i;
	// 	}
	// 	System.out.println(sum);
	// 	return sum;
	// }

	// public static int exponent(int x, int n) {
	// 	int exponent = 1;
	// 	for (int i = n; i > 0; i--) {
	// 		exponent= exponent * x;
	// 	}
	// 	System.out.println(exponent);
	// 	return exponent;
	// }
	public static int factorial(int factorial, int n) {
	
		for(int i=1; i <=n; i++) {
			factorial = factorial * i;
		
	}
	System.out.println("The factorial of " + n + " is " + factorial);
	return factorial;
	}
}