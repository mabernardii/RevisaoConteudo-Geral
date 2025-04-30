/******************************************************************************
Exercicio 004
Faça um Programa que converta metros para centímetros.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex04
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	int metros,conversao;
 	
 	System.out.print ("Insira o valor em metros para que será convertido em centímetros");
 	System.out.println  ("\nDigite o valor (m): ");
 	metros = ler.nextInt ();
 	
 	conversao= metros*100;
 	System.out.print ("\n" +metros + " x 100 = " + conversao);
 	System.out.println ("\nO valor após á conversão para centímetros é: " +conversao);
 	
 	}
 }