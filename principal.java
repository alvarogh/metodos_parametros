package com.Java.org;

import java.util.Scanner;

public class principal {
	
	public int numero1, numero2, resultado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		principal myClase = new principal();
		
		myClase.operacion();			//myClase.valores();
		//myClase.resultado(resultado);	
		//total = resultado;	
	
		//System.out.println("Resultado " + resultado;
		
	}
			
	public void valores() {
		Scanner entrada = new Scanner(System.in);	
		
		System.out.print("ingrese numero1: ");
		numero1 = entrada.nextInt();			

		System.out.print("Igrese numero2: ");
		numero2 = entrada.nextInt();		
	}
	
	public  void operacion(){
		
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicacion");
		System.out.println("4 divicion");
		int operacion;
				
		Scanner entrada = new Scanner(System.in);
		System.out.print("Operacion  ? " );		
		
		operacion = entrada.nextInt();	
			
		//valores();
		
		if (operacion  == 1){
			System.out.println("Operacion: " + "Suma");	
			valores();
			resultado = suma(numero1, numero2);			
			resultado(resultado);
		}else if (operacion == 2){
			System.out.println("Operacion: " + "Resta");
			valores();
			resultado = resta(numero1, numero2);
			resultado(resultado);
			
		}else if (operacion == 3){
			System.out.println("Operacion: " + "Multiplicacion");
			valores();
			resultado = multiplicacion(numero1, numero2);
			resultado(resultado);
		}else if(operacion == 4){
			System.out.println("Operacion: " + "Divicion");
			valores();
			resultado = divicion(numero1, numero2);
			resultado(resultado);
		}
	}
	
	public int suma(int num1, int num2){
		int total;
		total = num1 + num2;
		return total;
	}
	
	public int resta(int num1, int num2){
		int total;
		total = num1 - num2;			
		return total;
	}
	
	public int multiplicacion(int num1, int num2){
		int total;
		total = num1 * num2;
		return total;
	}
	
	public int divicion(int num1, int num2){
		int total;
		total = num1 / num2;	
		return total;
	}
		
	
	public void resultado(int resultado){
		int result;
		result = resultado;
		System.out.println("Resultados: " + resultado  );	
	}
	
}

