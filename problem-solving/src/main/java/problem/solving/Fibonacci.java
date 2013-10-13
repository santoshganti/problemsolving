package problem.solving;

public class Fibonacci {
	private int a = 0, b = 1, sum;

	/**
	 * loop{ sum=a+b; a=b; b=sum; }
	 */
	public int fibonacci(int n) {
		for (int i = 0; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);

		}
		return sum;
	}

}
