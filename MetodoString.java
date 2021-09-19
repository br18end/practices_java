package p08;

public class MetodoString {
	public static void main(String[] args) {
		String cadena=new String("esTo 123 es 45 BueNo 6");

		String minus;
		String mayus;
		String remp;
		String remp2;
		String mitad;
		String ast;
		int longi;
		int letras;
		int digitos;
		int espacios;


		longi=cadena.length();
		minus=cadena.toLowerCase();
		mayus=cadena.toUpperCase();
		letras=cadena.replaceAll("(?i)[^abcdefghijklmnopqrstuvwxyz]", "").length();
		digitos=cadena.replaceAll("(?i)[^123456]", "").length();
		espacios=cadena.replaceAll("(?i)[^ ]", "").length();
		remp=cadena.replace('e','a').replace('i','a').replace('o','a').replace('u','a');
		mitad=cadena.substring(0,11);
		remp2=cadena.replaceAll("es", "nopor");
		ast=cadena.replace('1','*').replace('2','*').replace('3','*').replace('4','*').replace('5','*').replace('6','*');

		System.out.println("Cadena: "+cadena);
		System.out.println("Longitud: "+longi);
		System.out.println("Minusculas: "+minus);
		System.out.println("Mayusculas: "+mayus);
		System.out.println("Letras: "+letras);
		System.out.println("Digitos: "+digitos);
		System.out.println("Espacios: "+espacios);
		System.out.println("Remplazar vocales por 'a': "+remp);
		System.out.println("Mitad:"+mitad);
		System.out.println("Remplazar 'es' por 'nopor': "+remp2);
		System.out.println("Remplazar digitos por *: "+ast);
	}

}
