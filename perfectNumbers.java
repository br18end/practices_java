import java.util.Scanner;
public class perfectNumbers {
	public static void main(String[] args) {
		int divisor = 1;
		int num;
		int perfect = 0;

		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=keyboard.nextInt();

		while(divisor < num){
			if(num % divisor == 0){
				perfect=perfect+divisor;
			}
			divisor=divisor+1;
		}

		if(perfect==num){
			System.out.println("Perfect number");
		}
		else{
			System.out.println("Not perfect number");
		}
	}
}
