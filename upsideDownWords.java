import java.util.Scanner;
public class udwords {
	public static void main(String[] args) {
		String data;

		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
		data=keyboard.nextLine();

		for (int i=data.length()-1; i>=0; i--){
			System.out.print(data.charAt(i));
		}
	}

}
