package com.alex.javabasico.exercicios;
import java.util.Scanner;

public class testandoEntradaDeDados {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in); // Esse SCAN �o nome que eu coloquei par identificar
		
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		System.out.println("Seu Sobre nome �: " + sobrenome);
		System.out.println("Sua idade �: " + idade);
		System.out.println("Sua altura �: " + altura);
		
		if(idade >=18){
			
			System.out.println("Voce � maior de idade. Pode entrar!");
			
		}else{
			
			System.out.println("Infelizmente voce nao tem a idade apropriada para entrar no site!!");
		}
		
		
	}

}
