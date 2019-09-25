import java.util.Scanner;	
public class fibonacci {
	int num;
	int a = 1;
	
	Scanner keyboard=new Scanner(System.in);
	System.out.print("Enter number: ");
	num=keyboard.nextInt();
	
	for (int i=0; i<=num-1;) {
		System.out.print(i+" ");
		i=i+a;
		a=i-a;
	}
}
