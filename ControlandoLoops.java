package com.alex.javabasico.exercicios;
/*	Apesar de termos condiçoes booleanas nos nossos laços,em algum momento, podemos decidir parar um loop
por algum mmotivo especial sem que o resto do loop seja executado: */

public class ControlandoLoops {

	public static void main(String[] args) {

		for(int i = 0; i < 90; i++){
			if (i % 19 == 0){
				System.out.println("Achei um numero divisivel por 19 entre X e Y");
			break;
				}
			}
		
/* 	O codigo acima vai percorrer os numeros de 0 a 90 ate encontrar um numero divisivel por 19, uma vez que foi utilizada
a palavra chave BREAK. */

/*	Da mesma forma é possivel obrigar o loop a executar o proximo laço. Para isso usamos a palavra chave CONTINUE. */

		for(int a = 0; a < 100; a++){
			if (a > 50 && a < 60){ //Aqui ele nao imprimirá de 51 a 59
				continue;
			}
				System.out.println(a);
				}		
		
	}

}
