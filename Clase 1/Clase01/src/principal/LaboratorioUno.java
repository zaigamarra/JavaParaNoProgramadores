package principal;

public class LaboratorioUno {

	public static void main(String[] args) {
		
		//Ejercicio 1 - Asignación básica
		
		System.out.println("EJERCICIO 1 - Asignación básica");
		
		System.out.println("A");
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("B");
		x = x+5;
		y = y+10;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("C");
		x = x-5;
		y = y-10;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("D");
		x = x*3;
		y = y*5;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("E");
		x = x/2;
		y = y/4;
		System.out.println(x);
		System.out.println(y);
		 
		
		//Ejercicio 2 - Asignación compacta
		
		System.out.println("EJERCICIO 2 - Asignación compacta");
		
		System.out.println("A");
		int r = 10;
		int u = 20;
		System.out.println(r);
		System.out.println(u);
		
		System.out.println("B");
		r += 5;
		u -= 15;
		System.out.println(r);
		System.out.println(u);
		
		System.out.println("C");
		r++;
		u--;
		System.out.println(r);
		System.out.println(u);
		
		System.out.println("D");
		r *= 4;
		u *= -3;
		System.out.println(r);
		System.out.println(u);
		
		System.out.println("E");
		r /= 2;
		u /= 4;
		System.out.println(r);
		System.out.println(u);
		
		// Ejercicio 3 - Operadores aritméticos
		
		System.out.println("EJERCICIO 3 - Operadores artiméticos");
		
		System.out.println("A");
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("B");
		a = a+b;
		b = b+a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("C");
		a = a-b;
		b = b-a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("D");
		a = a*b;
		b = a*a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("E");
		a = b/a;
		b = a/b;
		System.out.println(a);
		System.out.println(b);
		
		//Ejercicio 4 - Operadores aritméticos con asignación compacta
		
		System.out.println("EJERCICIO 4 - Operadores aritméticos con asignación compacta");
		
		System.out.println("A");
		int c = 5;
		int d = 10;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("B");
		c += d;
		d += c;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("C");
		c -= d;
		d -= c;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("D");
		c *= d;
		d *= c;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("E");
		c /= d;
		d /= d;
		System.out.println(c);
		System.out.println(d);
		
		//Ejercicio 5 - Operadores aritméticos con asignación múltiple (suma y resta)
		
		System.out.println("EJERCICIO 5 - Operadores aritméticos con asignación múltiple (suma y resta)");
		
		System.out.println("A");
		int e = 5;
		int f = 10;
		int suma = 0;
		int resta = 0;
		System.out.println(e);
		System.out.println(f);
		System.out.println(suma);
		System.out.println(resta);
		
		System.out.println("B");
		suma = e + f;
		resta = e - f;
		System.out.println(e);
		System.out.println(f);
		System.out.println(suma);
		System.out.println(resta);
		
		System.out.println("C");
		suma = e + e;
		resta = f - f;
		System.out.println(e);
		System.out.println(f);
		System.out.println(suma);
		System.out.println(resta);
		
		System.out.println("D");
		suma = e + f + e;
		resta = e - e - 20;
		System.out.println(e);
		System.out.println(f);
		System.out.println(suma);
		System.out.println(resta);
		
		System.out.println("E");
		suma = f + e + e;
		resta = - e - f - f;
		System.out.println(e);
		System.out.println(f);
		System.out.println(suma);
		System.out.println(resta);
		
		//Ejercicio 6 - Operadores aritméticos con asignación múltiple (producto y división)
		
		System.out.println("EJERCICIO 6 - Operadores aritméticos con asignación múltiple (producto y división)");
		
		System.out.println("A");
		int g = 5;
		int h = 10;
		int multi = 1;
		int division = 1;
		System.out.println(g);
		System.out.println(h);
		System.out.println(multi);
		System.out.println(division);
		
		System.out.println("B");
		multi = g*h;
		division = g/h;
		System.out.println(g);
		System.out.println(h);
		System.out.println(multi);
		System.out.println(division);
		
		System.out.println("C");
		multi = g*g;
		division = h/h;
		System.out.println(g);
		System.out.println(h);
		System.out.println(multi);
		System.out.println(division);
		
		System.out.println("D");
		multi = g*h*g;
		division = h/g;
		System.out.println(g);
		System.out.println(h);
		System.out.println(multi);
		System.out.println(division);
		
		System.out.println("E");
		multi = g*(-h);
		division = h/(-g);
		System.out.println(g);
		System.out.println(h);
		System.out.println(multi);
		System.out.println(division);
		
		//Ejercicio 7 - Operador restp
		
		System.out.println("EJERCICIO 7 - Operador resto");
		
		System.out.println("A");
		int n1 = 20;
		int n2 = 2;
		int n3 = n1%n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("B");
		n1 = 15;
		n2 = 2;
		n3 = n1%n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("C");
		n1 = 3;
		n2 = 20;
		n3 = n2%n1;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println("D");
		n1 = 3;
		n2 = 15;
		n3 = n1%n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		//Ejercicio 8 - Cadena de caracteres
		
		System.out.println("EJERCICIO 8 - Cadena de caracteres");
		
		System.out.println("A");
		String palabra_1 = "Hola";
		String palabra_2 = "Mundo";
		String frase = "";
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		
		System.out.println("B");
		frase = palabra_1 + palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		
		System.out.println("C");
		frase = palabra_1 + "\t" + palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		
		System.out.println("D");
		frase = palabra_1 + "\n" + palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		
		System.out.println("E");
		frase = palabra_1 + "\n \t" + palabra_2;
		System.out.println(palabra_1);
		System.out.println(palabra_2);
		System.out.println(frase);
		
		//Ejercicio 9 - Operadores lógicos
		
		System.out.println("EJERCICIO 9 - Operadores lógicos");
		
		System.out.println("A");
		boolean n5 = true;
		boolean n6 = false;
		boolean n7 = !n5;
		boolean n8 = !n6;
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		
		System.out.println("B");
		n7 = n5 & n6;
		n8 = n5 | n6;
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		
		System.out.println("C");
		n7 = !(n5 & n6);
		n8 = !(n5 | n6);
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		
		System.out.println("D");
		n7 = !n5 & n6;
		n8 = !n5 | n6;
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		
		System.out.println("E");
		n7 = n5 ^ n6;
		n8 = n5 ^ !n6;
		System.out.println(n5);
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(n8);
		
		// BONUS Ejercicio 1
		
		System.out.println("Bonus - Ejercicio 1");
		
		int nn1 = 5;
		int nn2 = 10; 
		int nn3 = 20;
		System.out.println("nn1 + nn2 = " + (nn1 + nn2));
		System.out.println("nn3 - nn1 = " + (nn3 - nn1));
		System.out.println("nn1 * nn3 = " + (nn1 * nn3));
		System.out.println("nn3 / nn2 = " + (nn3 / nn2));
		
		// BONUS Ejercicio 2
		
		System.out.println("Bonus - Ejercicio 2");
		
		int d1 = 10;
		int d2 = 20;
		int d3 = 30;
		int total = d1 +d2 + d3;
		System.out.println("El total es " + total);
		System.out.println("El promedio es " + (total/3));
		System.out.println("El resto entre d2 y d1 es " + (n2%n1));
		
		// BONUS Ejercicio 3
		
		System.out.println("Bonus - Ejercicio 3");
		
		boolean p1 = true;
		boolean p2 = false;
		boolean p3 = true;
		System.out.println("p1 ^ p2: " + (p1 ^ p2)); // True
		System.out.println("(p1 & !p2) | p3: " + ((p1 & !p2) | p3)); // True
		System.out.println("(p1 | p2) & !p3: " + ((p1 | p2) & !p3)); // False
		
		// BONUES Ejercicio 4
		
		System.out.println("Bonus - Ejercicio 4");
		
		int t1 = 5;
		int t2 = 10;
		System.out.println("t1 es igual a " + t1);
		System.out.println("t2 es igual a " + t2);
		System.out.println("t1 más t2 es igual a " + (t1 + t2));
		
		// BONUS Ejercicio 5
		
		System.out.println("Bonus - Ejercicio 5");
		
		final double IVA = 21;
		double remera = 59.90;
		double pantalon = 99.90;
		double campera = 149.90;
		System.out.println("Precio final de remera: " + (remera+remera*IVA/100));
		System.out.println("Precio final de pantalon: " + (pantalon+pantalon*IVA/100));
		System.out.println("Precio final de campera: " + (campera+campera*IVA/100));

	}
	
}
