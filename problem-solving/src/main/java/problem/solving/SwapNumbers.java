package problem.solving;

public class SwapNumbers {
	private int a, b;

	// a=a+b
	// b=a-b
	// a=a-b
	public void swap() {
		a = a + b;
		b = a - b;
		a = a - b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
