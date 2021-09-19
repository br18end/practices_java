package expoSecuencial;
public class Arreglo {
	private int datos[];
	private int tamaño;
	private int numElementos;
	private int posicion;

	public Arreglo() {
		tamaño = 10;
		datos=new int[tamaño];
		numElementos=0;
		posicion=-1;
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
	
	public void busquedaSecuencial(int valor){
		int i=0;
		while(posicion==-1&&i<numElementos){
			if(datos[i]==valor){
				posicion=i;
			}
			i++;
		}
		if(posicion==-1){
			System.out.println("No se encontro valor");
		}
		else{
			System.out.println("Se encontro valor "+valor+" en la posicion "+posicion);
		}
	}
	
	private void busquedaSecuencialRec(int valor, int posicion){
		if(posicion>numElementos){
				System.out.println("No se encontro valor");
		} else {
			if(datos[posicion]==valor){
				System.out.println("Se encontro valor "+valor+" en la posicion "+posicion);
			} else {
				busquedaSecuencialRec(valor, posicion + 1);
			}
		}
	}
	
	public void busquedaSecuencialRec(int valor){
		busquedaSecuencialRec(valor, 1);
	}
	
	
	public String toString(){
		String s="";
		System.out.println("Arreglo Desordenado");
		for(int i=0; i<numElementos; i++){
		s=s+"["+datos[i]+"]";
		}
		return s;
	}
}