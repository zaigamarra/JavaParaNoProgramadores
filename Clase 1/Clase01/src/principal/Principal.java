package principal;

public class Principal {
	/** Comentario de documentación */ 
	
	public static void main(String[] args) {
		
		System.out.println("Hola Clase Telecom");
		System.out.println("Hola Mundo");
		System.out.println("Hola Clase Digit@lers");
		
		//Comentarios de una sola línea
		
		/* Comentarios
		 * de 
		 * varias líneas
		 */
		
		//Constantes
		//final tipoDato IDENTIFICADOR;
		//final tipoDato IDENTIFICADOR = Valor;
		System.out.println("CONSTANTES");
		
		final byte miByteFinal;
		miByteFinal = 10;
		
		final byte miByteFinalDos = 20;
		
		System.out.println("miByteFinal: " +miByteFinal);
		System.out.println("miByteFinalDos: " +miByteFinalDos);
		
		//Variables
		//tipoDato IDENTIFICADOR;
		//tipoDato IDENTIFICADOR = Valor;
		System.out.println("VARIABLES");
		
		byte miByte;
		miByte = 27;
		
		byte miByteDos = 28;
		
		System.out.println("miByte: " +miByte);
		System.out.println("miByteDos: " +miByteDos);
		
		short miShort;
		miShort = 350;
		
		short miShortDos = 450;
		
		System.out.println("miShort: " +miShort);
		System.out.println("miShortDos: " +miShortDos);
		
		// Varias variables con distinto código
		
		int num1, num2, num3;
		int num4 = 22, num5, num6;
		
		num1 = 30;
				
		System.out.println("num1: " +num1);
		System.out.println("num4:" +num4);
		
		long miLong = 1999;
		
		float miFloat;
		miFloat = 10.5f; //f de float, de poca presición
		
		double miDouble;
		miDouble = 20.5; //también podemos poner la d en double o la l en long
		
		System.out.println("miLong: " +miLong);
		System.out.println("miFloat: " +miFloat);
		System.out.println("miDouble: " +miDouble);
		
		char miChar = 'k'; //sólo permiten un caracter, entre comillas simples
		
		boolean miBoolean = true;
		boolean miBooleanDos = false;
		
		System.out.println("miChar: " +miChar);
		System.out.println("miBoolean: " +miBoolean);
		System.out.println("miBooleanDos: " +miBooleanDos);
		
		String miString = "Zaira Gamarra";
		
		System.out.println("miString: " +miString);
		
		
		
		
		
	}
	
}
