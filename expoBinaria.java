package expoBinaria;
public class Arreglo {
	private int datos[];
	private int tamaño;
	private int numElementos;
	private int posicion;

	public Arreglo() {
		tamaño = 10;
		datos=new int[tamaño];
		numElementos=0;
	}
	
	public void insertar(int dato){
		if(numElementos<tamaño){
			datos[numElementos]=dato;
			numElementos++;
		}
		else{
			System.out.println("Error! arreglo lleno");
		}
	}
	public void busquedaBinaria(int valor){
		int centro = 0, inferior = 0, superior = datos.length-1;
		while(inferior <= superior&&datos[centro]!=valor){
			centro = (superior + inferior) / 2;
			if (datos[centro] == valor){
				System.out.println("Se encontro valor "+valor+" en la posicion "+centro);
			} else {
				if (datos[centro] > valor){
					superior = centro - 1;
				} else{
					inferior = centro + 1;
				}
			}
		} if(datos[centro]!=valor){
			System.out.println("No se encontro valor");
		}
	}
	
	private void busquedaBinariaRec(int inferior, int superior, int valor){
		int centro = 0;
		if(inferior>=superior){
			System.out.println("No se encontro valor");
		} else {
			centro = (int)((superior + inferior)/2);
		}
		if(valor == datos[centro]){
			System.out.println("Se encontro valor "+valor+" en la posicion "+centro);
		} else {
			if(valor > datos[centro]){
				busquedaBinariaRec(centro+1, superior, valor);
			} else {
				busquedaBinariaRec(inferior, centro-1, valor);
			}
		}
	}
	
	public void busquedaBinariaRec(int valor){
		busquedaBinariaRec(1, datos.length-1, valor);
	}

	public String toString(){
		String s="";
		System.out.println("Arreglo Ordenado");
		for(int i=0; i<numElementos; i++){
		s=s+"["+datos[i]+"]";
		}
		return s;
	}
}