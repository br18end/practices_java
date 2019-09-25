import java.util.Scanner;
public class factorialNumbers {
	public static void main(String[] args) {
		int num;
		int factorial=1

		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		num=keyboard.nextInt();

		for(int i=num; i>0; i--){
			factorial=factorial*i;
		}
		System.out.println("Factorial: "+factorial);
	}
}
