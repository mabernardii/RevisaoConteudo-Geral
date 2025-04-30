/******************************************************************************
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex10
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double n1,n2;

    System.out.println ("Insira o 1º número");
    n1= ler.nextDouble ();
    System.out.println ("Insira o 2º número");
    n2= ler.nextDouble ();
 	
 	if (n1>n2) {
 	    System.out.println ("O número 1 é o maior! ");
 	} else  {
 	    System.out.println ("O número 2 é o maior!");
 	}
 	}
 }