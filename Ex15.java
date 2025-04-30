/******************************************************************************
Exercicio 015
Faça um Programa que leia um número e exiba o dia correspondente da semana. 
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex15
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double dia;

    System.out.println ("Insira um número para que seja exibido o dia da semana correspondente (1 á 7):");
    dia= ler.nextDouble ();

 	if (dia==1) {
 	    System.out.println ("Hoje é Domingo!");
 	}  	else if (dia==2) {
 	    System.out.println ("Hoje é Segunda-feira!");
 	}   else if (dia==3) {
 	    System.out.println ("Hoje é Terça-feira!");
 	}   else if (dia==4) {
 	    System.out.println ("Hoje é Quarta-feira!");
 	}   else if (dia==5) {
 	    System.out.println ("Hoje é Quinta-feira!");
 	}   else if (dia==6) {
 	    System.out.println ("Hoje é Sexta-feira!");
 	}   else if (dia==7) {
 	    System.out.println ("Hoje é Sábado!");
 	}   else {
 	    System.out.println ("O valor inserido é inválido!");
 	}
 	}
 }