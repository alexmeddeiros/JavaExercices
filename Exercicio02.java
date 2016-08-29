package com.alex.javabasico.exercicios;
/*	Exenrcicio 02:
 		Imprima os numeros de 150 a 300
 */

public class Exercicio02 {
	
	public static void main(String[] args){
		
//Com o comando FOR
		for(int i = 150; i <= 300; i = ++i){
			System.out.println(i);
		}
		
//Com o comando WHILE
		
		int a = 150;
		while(a <= 300){
			System.out.println(a);
			a = ++a; //Aqui ele incrementa mais 1 ate chegar aos 300
		}
		
		
		
	}
	
}
