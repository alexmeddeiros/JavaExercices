package com.alex.javabasico.exercicios;

/*	EXERCICIO 02 c
 		Imprima todos os multiplos de 3, entre 1 e 100 */

public class Exercicio02c {

	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++){
			if(i % 3 == 0){// % significa o RESTO
				System.out.println(i);
				}
			}
		
//OU
		
		for(int a = 1; a < 100; a += 3){// è igaual a: a = a + 3 e fica: a += 3
//		for(int a = 1; a < 100; a = a + 3)
			System.out.println(a);
		}
		
		
		

	}

}
