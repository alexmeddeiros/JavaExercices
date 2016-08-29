package com.alex.javabasico.exercicios;
import java.util.Scanner;


public class IdadeCachorroTeste {
	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			
			System.out.println("Digite a idade do seu cachorro em idade de humano: ");
			int idadeCao = in.nextInt();
			
			System.out.println("A idade do seu cão em idade de cachorro é: " + idadeCao * 7);
			

	}

}
