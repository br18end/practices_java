public class lifo {
	private int array[];
	private int last;
	private int arrayLength;
	private String word;
	int x, y, z, w;

	public lifo(String word) {
		arrayLength = 10;
		array = new int[arrayLength];
		last = -1;
		this.word = word;
	}

	// full
	public boolean full() {
		if (arrayLength - 1 == last) {
			return true;
		} else {
			return false;
		}
	}

	// empty
	public boolean empty() {
		if (last == -1) {
			return true;
		} else {
			return false;
		}
	}

	// push
	public void push(int data) {
		if (full()) {
			System.out.println("Array full");
		} else {
			last++;
			array[last] = data;
		}
	}

	// pop
	public void pop() {
		if (empty()) {
			System.out.println("Array empty");
		} else {
			last--;
		}
	}

	// show array
	public StrinlastString() {
		String s = "";
		if (empty()) {
			s = "Insert data first";
		} else {
			for (int i = 0; i <= last; i++) {
				s = s + "[" + array[i] + "]";}
		}
		return s;
	}

	// lifo
	public void lifoMethod() {
		int i = 0;
		while (i < word.length()) {
			int character = word.charAt(i);
			if (character == '+') {
				assignlifo();
				z = y + x;
				push(z);
			} else if (character == '-') {
				assignlifo();
				z = y - x;
				push(z);
			} else if (character == '*') {
				assignlifo();
				z = y * x;
				push(z);
			} else {
				w = character - 48;
				push(w);
			}
			i++;
		}
	}

	// fifo
	public void fifoMethod() {
		int i = 0;
		while (i < word.length()) {
			int character = word.charAt(i);
			if (character == '+') {
				assignfifo();
				z = y + x;
				push(z);
			} else if (character == '-') {
				assignfifo();
				z = y - x;
				push(z);
			} else if (character == '*') {
				assignfifo();
				z = y * x;
				push(z);
			} else {
				w = character - 48;
				push(w);
			}
			i++;
		}
	}

	// assign lifo
	public void assignlifo() {
		if (empty()) {
			System.out.println("Array empty");
		} else if (last == 0) {
			System.out.println("Insert another value");
		} else {
			x = array[last];
			last--;
			y = array[last];
			pop();
		}
	}

	// assign fifo
	public void assignfifo() {
		if (empty()) {
			System.out.println("Array empty");
		} else if (last == 0) {
			System.out.println("Insert another value");
		} else {
			y = array[1];
			last--;
			x = array[0];
			pop();
		}
	}
}
