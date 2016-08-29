/*
 	Voce precisa do CASTING porque o JAVA faz as contas e vai armazenando sempre no
 	maior tipo que apareceu durante as operaçoes.
 */

package com.alex.javabasico.exercicios;

public class Casting {

	public static void main(String[] args) {

		// Casting Perfeito
		double d = 5;
		float f = 3;
		float x = f + (float) d; // Isso é um CASTING
		System.out.println(x);

		
		//Assim nao compila
		/*
			long a = 10000;
			int i = x;
					
			System.out.println(a);
		 */
		
		//Mas assim SIM, compila
		
		long a = 10000;
		int i = (int) x; //Casting Perfeito
		System.out.println(a);
		
		
		//Outro exemplo de Casteing Perfeito
		
		double d3 = 3.14;
		int n = (int) d3; //Casting Perfeito o INT serve para arredondar o VALOR double
		System.out.println(n);
		
		

	}

}
