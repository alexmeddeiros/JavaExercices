package com.alex.javabasico.exercicios;
//====================================
//====== DESAFIO FIBONACCI ===========
//====================================

//Faca o exercicio da serie Fibonacci usando apenas duas variaveis
public class DesafioFibonacci {

	public static void main(String[] args) {
		
		int anterior = 0;
		int atual = 1;
		while(atual < 100){
			System.out.println(atual);
			atual = anterior + atual;
			anterior = atual - anterior;
		}
		System.out.println(atual);

	}

}
