package problem.solving;

public class Factorial {
	public double calculateFactorial(int n){
		//n= number
		// n! = n*(n-1)*(n-2)......*1
		
		double f=1;
		
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}
	
}
