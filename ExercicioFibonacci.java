package com.alex.javabasico.exercicios;
//=============================================
//========= CLASSE FIBONACCI ==================
//=============================================

/*	Imprima osprimeiros numeros da serie Fibonacci até passar de 100. A  Serie Fibonacci é a seguinte: 
0,1,1,2,3,5,8,13,21,etc... Para calcular-la, o primeiro elemento vale 0, o segundo vale 1 e dai por diante, o n-ésimo vale o 
(n-1)-esimo elemento somado ao (n-2)-esimo elemento (ex: 8 = 5 + 3).  */

public class ExercicioFibonacci {

	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		while (atual < 100){
			System.out.println(atual);
		int proximo = anterior + atual;
		anterior = atual;
		atual = proximo;
		}
		System.out.println(atual);
		
		
//===========================================
//========== CONJECTURA DE COLLATZ =========
//===========================================
		int x = 13;
		System.out.println("Iniciando...\n" + x);
		while(x != 1){
			if(x % 2 == 0){
				x = x / 2;	
			}else{
				x = 3 * x + 1;
		}
			System.out.println(x);
		}

//===========================================
/* IMRPIMA A SEGUINTE TABELA USANDO FOR
   1
   2 4	
   3 6 9
   4 8 12 16	
   n n*2 n*3 ........ n*n		
*/
//===========================================
		int numero = 5;
		for (int linha = 1; linha <= numero; linha++){
			for(int coluna = 1; coluna <= linha; coluna++){
				System.out.println(linha * coluna + " ");
			}
			System.out.println();
		}
	
	
	
	
	}

}
