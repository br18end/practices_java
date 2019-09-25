import java.util.Scanner;
public class oddNumbers {
	public static void main(String[] args) {
		int num;
		int odd = 0;

		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=keyboard.nextInt();

		for(int i=1; i<=num; i++){
			if(num%i==0){
				odd=odd+1;
			}
		}
		if(odd>=3){
			System.out.println("Not odd");
		}
		else{
			System.out.println("Odd");
		}
	}
}
