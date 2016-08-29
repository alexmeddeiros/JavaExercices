/*======IF e Else========
==A sintaxe do IF no java �:
 	 
 	 if (condicaoBooleana) {
 	 	codigo;
 	 }
 	 
==A sintaxe do IF e ELSE no java �:
 	 
 	 if (condicaoBooleana) {
 	 	codigo;
 	 }else{
 	 	codigo;
 	 }
 	 
 	 
 === Uma CONDI�AO BOOLEANA � qualquer expressao que retorne TRUE ou FALSE. Para isso
 usa-se os operadores: <,>,<=,>= entre outros.*/
package com.alex.javabasico.exercicios;

public class IfElse {

	public static void main(String[] args) {
/*
		int idade = 12;
		if(idade < 18) {
			System.out.println("N�o pode entrar");
		
		}else{
			System.out.println("Pode entrar");
				
			}	
		}
*/		
	//------------------------------

/* 	Podemos concatenar expressoes BOOLEANA atraves de operadores logicos
 "E" e "OU". O "E" � representado por && e o "OU" � representado por ||.
 
====No exemplo abaixo poderia se verificar se tem mais de 
18 anos E se � amigo do dono:*/
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && amigoDoDono == false) {
			
			System.out.println("N�o pode entrar");
			
		}else{
			System.out.println("Pode entrar");
			
		}
		
/*	Esse codigo poderia ficar mais legivel utilizando o operador de nega�ao "!".
Esse operador transforma o resultado de uma expressao Booleana de FALSE para TRUE
e vice versa. */
		
		// O mesmo exemplo acima trocando apenas as variaveia para nao da erro
		int idade2 = 19;
		boolean amigoDoDono2 = true;
		if (idade2 < 18 && !amigoDoDono2) {
			
			System.out.println("N�o pode entrar");
			
		}else{
			System.out.println("Pode entrar");
			
		}
	}

}