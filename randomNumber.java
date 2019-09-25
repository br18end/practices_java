public class randonNumber {
	public static void main(String[] args) {
		int num;
		for (int i = 0; i < 10; i++) {
			num = (int) (Math.random() * 100);
			System.out.print("["+num+"]");
		}
	}
}
