package com.alex.javabasico.exercicios;
/*	EXERCICIO 02 b
 		Imprima a soma de 1 até 1000.  */

public class Exercicio02b {
	public static void main(String[] args){
		
		int soma = 0;
		int i = 1;
		while(i <= 1000){
			soma = soma + i;
			i++;
		System.out.println(i);
		}

//OU
		int soma1 = 0;
		for(int a = 1; a <= 1000; a++){
			soma1 = soma1 + a;
			System.out.println(a);
		}
		
		
		
	}
}



