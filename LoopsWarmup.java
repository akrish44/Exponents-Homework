public class LoopsWarmup {

	public static void main(String[] args) {
		int n = 5;
		int x = 1;
		// exponent(2,3);


	}

	// public static int sum(int n) {
	// 	int sum = 1;
	// 	for (int i=1; i <=n; i++) {
	// 		sum+=i;
	// 				}
	// 	System.out.println(sum);
	// 	return sum;
	// }
	// public static int exponent(int x, int n) {
	// 	int exponent = 1;
	// 	for (int i = n; i > 0; i--) {
	// 		exponent= exponent * x;
	// 	}
	// 	System.out.println(x + " to the power of " + n "equals " + exponent);
	// }
	
	public static int factorial(int n) {
		int factorial=1;
		for(int i=1; i <=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of " + n + "equals " + factorial);
		return factorial;
	}
}