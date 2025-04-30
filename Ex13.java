/******************************************************************************
Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex13
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double n1, n2, n3;

    System.out.println ("Insira o valor do 1º número:");
    n1= ler.nextDouble ();
    System.out.println ("Insira o valor do 2º número:");
    n2= ler.nextDouble ();
    System.out.println ("Insira o valor do 3º número:");
    n3= ler.nextDouble ();

 	if (n1>n2 && n1>n3) {
 	    System.out.println ("O número 1 é o maior!");
 	} else if (n2>n3 && n2>n1) {
 	    System.out.println ("O número 2 é o maior!");
 	} else if (n3>n1 && n3>n2) {
 	    System.out.println ("O número 3 é o maior!");
 	}    
 	}
 }