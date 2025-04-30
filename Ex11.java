/******************************************************************************
Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex11
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double valor;

    System.out.println ("Insira um valor:");
    valor= ler.nextDouble ();

 	if (valor>0) {
 	    System.out.println ("O valor inserido é positivo.");
 	} else  {
 	    System.out.println ("O valor inserido é negativo.");
 	}
 	}
 }