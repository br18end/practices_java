import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String word1;
		String word2;

		Scanner keyboard=new Scanner(System.in);
		word1=keyboard.nextLine();
		word2="";

		for(int i=word1.length()-1; i>=0; i--){
			word2=word2+word1.charAt(i);
		}
		if(word1.equals(word2)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	}
}
