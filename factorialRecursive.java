package p02;

public class factorial {
	public long factorial(long n){
		if (n == 0) return 1;
		else return n * factorial(n-1);
	}
}
