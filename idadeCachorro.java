package com.alex.javabasico.exercicios;
import java.util.Scanner;

public class idadeCachorro{
	public static void main(String[] args){
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a idade do seu c�o");
		int idadeCao = in.nextInt();
		System.out.println("A idade do seu c�o em idade de cachorro �: " + idadeCao * 7);
			
	}		
}