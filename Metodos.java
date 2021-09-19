package p20;

public class Metodos {
	int[] arreglo={13,6,11,15,10,2,17,3,1,5,4,18,20,9,12,16,7,19,34,8,14,21,32,24,47,28,29,48,31,45,44,42,27,35,36,37,38,22,50,39,40,41,33,43,25,26,46,49,30,23};
	int[] arreglo1={1,2,3,5,6,10,11,13,15,17,21,23,29,30,31,34,35,38,40,42,43,44,45,46,50};
	int[] arreglo2={4,7,8,9,12,14,16,18,19,20,22,24,25,26,27,28,32,33,36,37,39,41,47,48,49};
	/*int n=100;
	int[] arreglo=new int[n];
	Metodos(){
		for (int i=0;i<n;i++){	
			arreglo[i]= ((int) Math.random() * 100); 
		}
	}*/
	

	public void imprimir(){
		System.out.println("Arreglo Desordenado");
		for(int i = 0; i < arreglo.length; i++){
			System.out.print("["+arreglo[i]+"]");
			}System.out.println();
	}
	//BUBLESORT
	public void bublesort(){
		int auxiliar;
		for(int i = 2; i < arreglo.length; i++){
			for(int j = 0; j < arreglo.length-1; j++){
				if(arreglo[j] > arreglo[j+1]){
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				} 
			}
		}System.out.println("\nBublesort");
		for(int i = 0; i < arreglo.length; i++){
		System.out.print("["+arreglo[i]+"]");
		}
	}
	//QUICKSORT
	public void quicksort(){
		quicksort(0,arreglo.length-1);
		System.out.println("\nQuicksort");
		for(int t = 0; t < arreglo.length; t++){
			System.out.print("["+arreglo[t]+"]");
		}
	}
	private void quicksort(int izq, int der) {
		int pivote=arreglo[izq];
		int i=izq;
		int j=der;
		int aux;
		while(i<j){
			while(arreglo[i]<=pivote && i<j) i++;
			while(arreglo[j]>pivote) j--;
			if (i<j) {                   
				aux= arreglo[i];
				arreglo[i]=arreglo[j];
				arreglo[j]=aux;
			}
		}
		arreglo[izq]=arreglo[j];
		arreglo[j]=pivote;
		if(izq<j-1){
			quicksort(izq,j-1);
		}
		if(j+1 <der){
			quicksort(j+1,der);
		}
	}
	//SHELLSORT
	public void shellsort() {
        final int n = arreglo.length;
        int incremento = n;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && arreglo[j] < arreglo[j - incremento]) {
                        int tmp = arreglo[j];
                        arreglo[j] = arreglo[j - incremento];
                        arreglo[j - incremento] = tmp;
                        j -= incremento;
                    }
                }
            }
        } while (incremento > 1);
        System.out.println("\nShellsort");
		for(int i = 0; i < arreglo.length; i++){
			System.out.print("["+arreglo[i]+"]");
		}
    }
	//RADIX
	public void radix(){
		if(arreglo.length == 0){
			System.out.println("Arreglo vacio o un unico valor");
		} else {
			int[][] np = new int[arreglo.length][2];
			int[] q = new int[256];
			int i,j,k,l,f = 0;
			for(k=0;k<4;k++){
				for(i=0;i<(np.length-1);i++){
					np[i][1] = i+1;
				}
				np[i][1] = -1;
				for(i=0;i<q.length;i++){
					q[i] = -1;
				}
				for(f=i=0;i<arreglo.length;i++){
					j = ((255<<(k<<3))&arreglo[i])>>(k<<3);
					if(q[j] == -1){
						l = q[j] = f;
					}
					else{
						l = q[j];
						while(np[l][1] != -1)
							l = np[l][1];
						np[l][1] = f;
						l = np[l][1];
					}
					f = np[f][1];
					np[l][0] = arreglo[i];
					np[l][1] = -1;
				}
				for(l=q[i=j=0];i<256;i++){
					for(l=q[i];l!=-1;l=np[l][1]){
						arreglo[j++] = np[l][0];
					}
				}
			}
			System.out.println("\nRadixsort");
			for(int t = 0; t < arreglo.length; t++){
				System.out.print("["+arreglo[t]+"]");
			}
		}
	}
	//INTERCALACION
	public void intercalacion(){
		int m=arreglo1.length;
		int n=arreglo2.length;
		int[] mezcla = new int[arreglo1.length + arreglo2.length];
		int i=0,j=0,k=0,p;
		while( i < m && j < n ){
			if( arreglo1[i] <= arreglo2[j] ){
				mezcla[k]=arreglo1[i];
				i++;
			}
			else{
				mezcla[k]=arreglo2[j];
				j++;
			}
			k++;
		}
		if( i>= m){
			for( p=j; p < n; p++){
				mezcla[k]=arreglo2[p];
				k++;
			}
		}
		if( j>=n ){
			for( p=i; p < m; p++ ){
				mezcla[k]=arreglo1[p];
				k++;
			}
		} System.out.println("\nIntercalacion");
		for(int t = 0; t < arreglo.length; t++){
			System.out.print("["+mezcla[t]+"]");
		}
	}
	//MEZCLA DIRECTA
	public void mezclaDirecta(){
		int[] workSpace = new int[50];
		recMergeSort(workSpace, 0, 49);
		System.out.println("\nMezcla directa");
		for(int i = 0; i < arreglo.length; i++){
			System.out.print("["+arreglo[i]+"]");
		}
	}
	private void recMergeSort(int[] workSpace, int lowerBound, int upperBound){
		if(lowerBound == upperBound){
			return;
		} else {
			int mid = (lowerBound+upperBound) / 2;
			recMergeSort(workSpace, lowerBound, mid);
			recMergeSort(workSpace, mid+1, upperBound);
			merge(workSpace, lowerBound, mid+1, upperBound);
		}
	}
	private void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound){
		int j = 0;
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n = upperBound-lowerBound+1;
		while(lowPtr <= mid && highPtr <= upperBound)
			if( arreglo[lowPtr] < arreglo[highPtr] ){
				workSpace[j++] =arreglo[lowPtr++];
			} else {
				workSpace[j++] = arreglo[highPtr++];
			}
		while(lowPtr <= mid){
			workSpace[j++] = arreglo[lowPtr++];
		}
		while(highPtr <= upperBound){
			workSpace[j++] = arreglo[highPtr++];
		}
		for(j=0; j<n; j++){
			arreglo[lowerBound+j] = workSpace[j];
		}
	}
	//MEZCLA NATURAL
	public void mezclaNatural(){
		mn (arreglo,0,arreglo.length-1);
		System.out.println("\nMezcla natural");
		for(int i = 0; i < arreglo.length; i++){
			System.out.print("["+arreglo[i]+"]");
		}
	}
	private void mn (int arreglo[], int bajo, int alto){
		if (bajo < alto){
			int medio = (alto + bajo)/2;
			mn (arreglo, bajo, medio);
			mn (arreglo, medio+1, alto);
			mezcla (arreglo, bajo, medio+1, alto);
		}
	}
	private void mezcla (int arreglo[], int bajo, int bajo_2, int alto){
		int i = bajo;
		int finbajo = bajo_2 -1; 
		int j = bajo_2;
		int k = bajo;
		int arraux[]=new int [arreglo.length];
		while (( i <= finbajo) && (j<= alto))
		{
			if (arreglo[i] <= arreglo[j]){
				arraux[k++] = arreglo[i++];
			}
			else{
				arraux[k++] = arreglo[j++];
			}
		}
		while (i <= finbajo){
			arraux[k++] = arreglo[i++];
		}
		while (j <= alto) {
			arraux[k++] = arreglo[j++];
		}
		for (i = bajo; i <= alto; i++){
			arreglo[i] = arraux[i];
		}
	}
	//BUSQUEDA SECUENCIAL
	public void busquedaSecuencial(int valor){
		int i=0;
		int posicion=-1;
		int numElementos=20;
		System.out.println("\nBusqueda Secuencial");
		while(posicion==-1&&i<numElementos){
			if(arreglo[i]==valor){
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
	//BUSQUEDA BINARIA
	public void busquedaBinaria(int valor){
		int centro = 0, inferior = 0, superior = arreglo.length-1;
		System.out.println("Busqueda Binaria");
		while(inferior <= superior&&arreglo[centro]!=valor){
			centro = (superior + inferior) / 2;
			if (arreglo[centro] == valor){
				System.out.println("Se encontro valor "+valor+" en la posicion "+centro);
			} else {
				if (arreglo[centro] > valor){
					superior = centro - 1;
				} else{
					inferior = centro + 1;
				}
			}
		} if(arreglo[centro]!=valor){
			System.out.println("No se encontro valor");
		}
	}
	//BUSQUEDA POR FUNCIONES DE HASH
	public void busquedaHash(int valor){
		int n = arreglo.length;
		int dx=0;
		int d=0;
		System.out.println("Busqueda Hashing");
		if(arreglo[d] == valor ){
			System.out.println("Se encontro valor "+valor+" en la posicion "+d);
		} else {
			dx = d + 1;
			while((arreglo[dx] != valor)&&(dx != d)){
				dx++;
				if(dx == n-1){
					dx = 0;
				}
			}
			if(arreglo[dx] == valor){
				System.out.println("Se encontro valor "+valor+" en la posicion "+dx);
			} else {
				System.out.println("No se encontro valor");
			}
		}
	}
}
