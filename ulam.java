import java.util.Scanner;
public class ulam {
	public static void main(String[] args) {
		int num;
    
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter number: ");
		num=keyboard.nextInt();

		while(num!=1) {
			if(num%2==0){
				num=num/2;
				System.out.println(num);
			}
			else{
				num=(num*3)+1;
				System.out.println(num);
			}
		}
	}
}
