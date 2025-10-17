package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Introduce el primer numero");
		a = sc.nextDouble();
		System.out.println("Introduce el segundo numero");
		b = sc.nextDouble();
		
		double suma = sumar(a, b);
		System.out.println(suma);
		
		double resta = restar(a,b);
		System.out.println("El resultado de la resta de estos dos numeros es:" +resta);
	}
		public static double sumar(double a, double b) {
	return a + b;
		
	}
		public static double restar (double a, double b) {
			return a- b;
		}
		

}
