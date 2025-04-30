/******************************************************************************
Exercicio 016
Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
Dica: utilize o operador módulo (resto da divisão).
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex16
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	int numero, resultado;

    System.out.println ("Insira um número inteiro");
    numero= ler.nextInt ();
    
    resultado= numero%2;
    
 	if (resultado==0) {
 	    System.out.println ("Esse número é par!");
 	}  	else if (resultado==1) {
 	    System.out.println ("Esse número é ímpar!");
 	}    
 	}
 }