public class TwoDim {
	public static void main(String[] args) {
		int sum = 0;
		int [][] ary ={ {1, 2, 3},
						 {4, 5, 6},
						 {7, 8, 9} };
		for (int c = 0; c<3; c++) {
			sum = 0;
			for (int r=0; r <3; r++) {
				sum = sum + ary[r][c];
			}
			System.out.println("Column= " + c + " " + sum);
		}
	}
}