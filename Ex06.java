/******************************************************************************
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre 
a temperatura em graus Celsius. C = (5 * (F-32) / 9).
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex06
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	int temperatura, conversao;

    System.out.println ("Digite a temperatura em Farenheit e obtenha o valor em Celsius");
 	System.out.println ("Qual a temperatura atual em Farenheit?");
 	temperatura= ler.nextInt ();
 	
 	conversao = (5*(temperatura - 32) / 9);
 	System.out.println ("\nA temperatura atual em Farenheit é " +temperatura);
 	System.out.println ("A temperatura atual em Celsius é " +conversao);
 	}
 }