package principal;

public class Operadores {
	
	public static void main(String[] args) {
		
		//Operadores
		System.out.println("OPERADORES");
		
		//Operadores de asignación
		
		int num1, num2, total;
		
		num1 = 10;
		num2 = num1; //Le asigno el mismo valor que num1
		num2 = 15; //Le asigno un nuevo valor
		total = num1 + num2;
		
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Total: " + total);
		
		// Existe print y println
		/*
		 * Print imprime en una sola fila
		 * Println imprime y al final hace un salto de línea		
		 */
		
		System.out.print(num1);
		System.out.print(" --- ");
		System.out.print(num2);
		System.out.print(" --- ");
		System.out.print(total);
		
		System.out.println("\"Hola Mundo\"");
		// la barra \ es un caracter de escape
		// \t es un tabulador
		// \n es un salto de línea
		// \r de retorno de carro
		// \\ para poner una sola barra
		
		System.out.println("Zaira \n Gamarra");
		System.out.println("Zaira \r Gamarra");
		System.out.println("c:\\programa\\archivo");
		
		total +=10;
		System.out.println("El total ahora es: "+total);
		
		total -=40;
		System.out.println("El total ahora es: " +total);
		
		total *=2;
		System.out.println("El total ahora es: " +total);
		
		total /=3;
		System.out.println("El total ahora es: " +total);
		// Trunca el resultado
		
		double totalDos = 0;
		totalDos = num1/num2; // 10/15 es 0.66
		System.out.println(totalDos);
		//Da 0.0 porque da enteros, porque por más que le diga que totalDos es double
		// le doy num1 y num2 que son enteros
		
		//Si hago la división literal
		totalDos = 10/15;
		System.out.println(totalDos);
		
		//Si hago la división con coma
		totalDos = 10.0/15.0;
		System.out.println(totalDos);
		
		//Pero puedo indicar que son double
		totalDos = 10d/15d;
		System.out.println(totalDos);
		
		/*
		 * Los literales sin decimales son todos enteros (int)
		 * Los literales decimales son todos double, de doble precisión
		 */
		
		total = total + 1;
		System.out.println(total);
		total +=1;
		System.out.println(total);
		total++;
		System.out.println(total);
		++total;
		System.out.println(total);
		 
		System.out.println(++total); //primero suma y después imprime
		System.out.println(total++); //primero imprime y después suma
		System.out.println(total);
		
		System.out.println(totalDos);
		totalDos = total + 1.5;
		System.out.println(totalDos);
		
		String palabra = " " + '0';
		System.out.println(palabra);
		
		boolean mayorEdad = true;
		System.out.println(mayorEdad);
		
		//Operadores relacionales
		
		System.out.println(10==15);
		System.out.println(6>=3);		
		System.out.println(10!=20);
		System.out.println(true==false);
		
		System.out.println(10>3 && 5==5);
		
		
	}
	
}
