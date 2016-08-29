package com.alex.javabasico.exercicios;
/*====FOR====
 	O FOR é outro comando de loop estremamente utilizado. A ideia é a mesma do WHILE: Fazer um trecho de
 codigo se repetir enquanto a consiçao continuar verdadeira. 
 	Mas além disso, o FOR isola tambem um espara para a inicializacão de variaveis e modificadores
 dessas variaveis. fazendo o codigo ficar mais legivel.
 
 	Sintaxe:
 		
 		for (inicializacão; condiçao; incremento){
 			codigo;
 		}
 */
public class For {

	public static void main(String[] args) {
		
	// ESSE CODIGO FEITO COM while:
		int idade = 15;
		while (idade < 18){
			System.out.println(idade);
		idade = idade + 1;
			System.out.println(idade);
			System.out.println("Agora sim pode entrar");	
		}
		
		
	// COM O for FICARIA ASSIM: ===BEM MAIS LEGIVEL E BONITO
		for (int idade1 = 15; idade1 < 18; idade1 = idade1 + 1){
			System.out.println(idade1);
			System.out.println("Agora sim pode entrar");	
		}
		
		
//============PÓS INCREMENTO=======================
/*	i = i + 1 pode ser realmente substituido por i++ quando isolado, porem, em alguns casos, 
temos essa instruçao envolvida em, por exemplo uma atribuiçao:
	
	int i = 5;
	int x = i++;
	
	O operador ++, quando vem APOS a variavel, retorna o valor antigo, e incrementa(POS INCREMENTO),
fazendo o X valer 5.
 	Se usado ANTES da variavel(PRE INCREMENTO), o resultado seria 6.
 	
 	int i = 5;
 	int x = ++i;
 
 */

		int a = 5;
	 	int x = a++; // Aqui Continuar valendo 5
	 	System.out.println(x);
	 	
	 	
	 	int b = 5;
	 	int z = ++b; // Aqui vale 6
	 	System.out.println(z);
		
	
	}
}
