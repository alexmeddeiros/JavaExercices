package com.alex.javabasico.exercicios;
import java.util.Scanner;

public class CadastroDeFuncionarios {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nomeDoFuncionario = in.nextLine();
		
		System.out.println("Cargo: ");
		String cargo = in.nextLine();
		
		System.out.println("Idade: ");
		int idade = in.nextInt();
		
		
		System.out.println("Data de admiss�o: ");
		int dataAdmissao = in.nextInt();
		
		System.out.println("Sal�rio: ");
		Double salario = in.nextDouble();
		
		
		System.out.println("\n\nDADOS DO FUNCIONARIO: \n\n");
		
		System.out.println("Nome: " + nomeDoFuncionario);
		System.out.println("Cargo: " + cargo);
		System.out.println("Idade: " + idade);
		System.out.println("Data de Adimiss�o: " + dataAdmissao);
		System.out.println("Sal�rio: " + salario);
		
		

		
		

	}

}
