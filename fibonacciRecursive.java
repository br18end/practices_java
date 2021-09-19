package p03;

public class fibonacci {
	public int fibonacci(int n){
		if (n == 1||n==2) return 1;
		else return n * fibonacci(n-2)+fibonacci(n-1);
	}
}
