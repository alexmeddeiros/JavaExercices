package com.alex.javabasico.exercicios;
/*	EXERCICIO 02 
		Imprima todos os fatorais de 1 a 10 
		
====OBS.: O fatoral de um numero é: n*n-1*n-2... ate n=1. Lembre-se de utilizar Parenteses. 

	
	O fatorial de 0 é 1
	O fatorial de 1 é (0!) * 1 = 1
	O fatorial de 2 é (1!) * 2 = 2
	O fatorial de 3 é (2!) * 3 = 6
	O fatorial de 4 é (3!) * 4 = 24

Assim por diante... */

public class Exercicio02d {

	public static void main(String[] args) {
		
		int fatorial = 1;
		for (int n = 1; n <= 30; n++){// n<=30 indica quantas vezes sera imprimido qu deveria ser n<=10
			fatorial = fatorial * n;
			System.out.println("fat(" + n+ ") = " + fatorial);
		}

/*	 O codigo acima	em determinado momento , alem do cauculo demora, vaicomecar a mostrar resposta compretamente erradas
 Isso acontece porq a partir de 16! o valor supera o limite superior do tipo INT.
 	O tipo LONG consergue armazenar o calculo dos fatoriais ate 34!
 Se dpedisse para imprimir ate 10 o INT seria o perfeito Mas como pediu pra imprimir ate 30, dai seria melhor usar tipo LONG
 	
 	Experimente trocar INT por LONG
 

 */

		
		
	}

}
