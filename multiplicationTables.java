import java.util.Scanner;
public class multTables {
	public static void main(String[] args) {
		int n;
		int result = 0;

		Scanner keyboard=new Scanner(System.in);

		System.out.println("Multiplication table of n");
		System.out.print("Enter number: ");
		n=keyboard.nextInt();

		for(int i=1;i<=12;i++){
			result=n*i;
			System.out.println(n+"x"+i+"="+result);
		}
	}
}
