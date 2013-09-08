import java.util.Scanner;
public class Exponents  {

public static void main(String[] args) {
	
		System.out.println("Enter a number: ");
		Scanner reader = new Scanner (System.in);
		long x = reader.nextLong();
		long n = 1;
		double sum = 1.0;
		//double sum = 0.0;


		double lessThan = Math.pow(10, -12);
		double term = 7;
		long fact = 1;
		System.out.println("Limit value=" + lessThan);
		while (term >= lessThan)
		{

			fact = 1;
			for (long k = 1; k <= n; k++) {
				fact = (fact*k);
			} 
			//System.out.println();

			double ex=Math.pow(x,n);
			term = ex / fact;
			sum = sum + term;
			System.out.println("n=" + n + "; Factorial= " + fact + "; Term=" + term + "; Power= " + ex + "; Sum= " + sum );
			n++;
		}
		System.out.println("Real: " + Math.exp(x));
	}	
}
