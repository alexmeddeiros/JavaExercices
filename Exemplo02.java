package com.alex.javabasico.exercicios;

import java.util.Date;
//w  ww.  j a  va  2  s .  com
public class Exemplo02 {
	
	public static void main(String[] args) {
	 // Formatting strings
		 System.out.printf("%1$s, %2$s,  and  %3$s %n", "ABC", "DEF", "XYZ");
		 System.out.printf("%3$s, %2$s,  and  %1$s %n", "ABC", "DEF", "XYZ");
		
		 // Formatting numbers
		 System.out.printf("%1$4d, %2$4d, %3$4d %n", 1, 10, 100);
		 System.out.printf("%1$4d, %2$4d, %3$4d %n", 10, 100, 1000);
		 System.out.printf("%1$-4d, %2$-4d,  %3$-4d %n", 1, 10, 100);
		 System.out.printf("%1$-4d, %2$-4d,  %3$-4d %n", 10, 100, 1000);
		
		 // Formatting date and time
		 Date dt = new Date();
		 System.out.printf("Today is  %tD  %n", dt);
		 System.out.printf("Today is  %tF  %n", dt);
		 System.out.printf("Today is  %tc  %n", dt);
	}
}