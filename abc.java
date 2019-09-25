public class abc {
	public static void main(String[] args) {
		char arrChar1[];
		arrChar1 = new char[10];

		System.out.println("ABC");
		for (int i = 0; i < 5; i++) {
			arrChar1[i] = (char) ('a' + i);
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("["+arrChar1[i]+"]");
		}
	}
}
