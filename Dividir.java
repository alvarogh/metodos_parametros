package com.Java.org;

import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1, numero2;
		double resultado;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdu ce  Numero1: ");
		numero1 = entrada.nextInt();
		
		System.out.println("IUnbtroduce Numero2: ");
		numero2 = entrada.nextInt();
		
		resultado = numero1 / numero2;
		
		System.out.println("El resultado de dividir " + numero1 + " / " + numero2 + " es: " + resultado);
		
		
		System.out.printf("El resultado de dividir %d / %d es %f\n " , numero1, numero2, resultado);

	}

}
