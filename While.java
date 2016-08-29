package com.alex.javabasico.exercicios;

/*====WHILE=====
 	O WHILE é um comando usado para fazer LOOP, (o FOR tambem) repetir um trecho de codigo algumas vezes.
 A ideia é que esse trecho de codigo seja repetido enquanto uma determinada condiçao permanecer
 verdadeira. */

public class While {

	public static void main(String[] args) {
		
		int idade = 15;
		while (idade < 18){
			System.out.println(idade);
		idade = idade + 1;	//O Codigo vai repetir ate chegar a 18 Anos
		
			if(idade >=18){
				System.out.println(idade);
				System.out.println("Agora sim pode entrar");
				
			}
		}

//----------Outro Exemplo:
		int i = 0;
		while (i < 10){
			System.out.println(i);
		i = i + 1;
		}
		
	}

}
