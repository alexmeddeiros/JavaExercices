package com.alex.javabasico.exercicios;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestrais = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos do Primeiro Trimestre: R$" + gastosTrimestrais);
		
		int mediaPorMes = gastosTrimestrais / 3; //Para dá a media dos meses
		
		System.out.println("Media mensal: R$" + mediaPorMes);
		
	}

}
