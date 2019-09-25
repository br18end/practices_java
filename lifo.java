public class Pila {
	private int arreglo[];
	private int tope;
	private int tamaño;
	private String cadena;
	int x, y, z, w; 

	public Pila(String cadena) {
		tamaño = 10;
		arreglo = new int[tamaño];
		tope = -1;
		this.cadena = cadena;
	}

	// LLENA
	public boolean llena() {
		if (tamaño - 1 == tope) {
			return true;
		} else {
			return false;
		}
	}

	// VACIA
	public boolean vacia() {
		if (tope == -1) {
			return true;
		} else {
			return false;
		}
	}

	// INSERTAR
	public void push(int dato) {
		if (llena()) {
			System.out.println("Arreglo lleno");
		} else {
			tope++;
			arreglo[tope] = dato;
		}
	}

	// ELIMINAR
	public void pop() {
		if (vacia()) {
			System.out.println("Arreglo vacio");
		} else {
			tope--;
		}
	}

	// IMPRIMIR ARREGLO
	public String toString() {
		String s = "";
		if (vacia()) {
			s = "Ingrese datos primero";
		} else {
			for (int i = 0; i <= tope; i++) {
				s = s + "[" + arreglo[i] + "]" ;
			}
		}
		return s;
	}

	// PILA
	public void pila() {
		int i = 0;
		while (i < cadena.length()) {
			int caracter = cadena.charAt(i);
			if (caracter == '+') {
				asignarPila();
				z=y+x;
				push(z);
			} else if (caracter == '-') {
				asignarPila();
				z=y-x;
				push(z);
			} else if (caracter == '*') {
				asignarPila();
				z=y*x;
				push(z);
			} else {
				w = caracter - 48;
				push(w);
			}
			i++;
		}
	}
	
	// COLA
	public void cola() {
		int i = 0;
		while (i < cadena.length()) {
			int caracter = cadena.charAt(i);
			if (caracter == '+') {
				asignarCola();
				z=y+x;
				push(z);
			} else if (caracter == '-') {
				asignarCola();
				z=y-x;
				push(z);
			} else if (caracter == '*') {
				asignarCola();
				z=y*x;
				push(z);
			} else {
				w = caracter - 48;
				push(w);
			}
			i++;
		}
	}
	
	// ASIGNAR PILA
	public void asignarPila(){
		if(vacia()){
			System.out.println("Arreglo vacio");
		} else if(tope==0){
			System.out.println("Ingrese otro dato");
		} else {
			x=arreglo[tope];
			tope--;
			y=arreglo[tope];
			pop();
		}
	}
	
	// ASIGNAR COLA
	public void asignarCola(){
		if(vacia()){
			System.out.println("Arreglo vacio");
		} else if(tope==0){
			System.out.println("Ingrese otro dato");
		} else {
			y=arreglo[1];
			tope--;
			x=arreglo[0];
			pop();
		}
	}
}
