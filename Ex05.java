/******************************************************************************
Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex05
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	int valor, horas, salario;
 	String mes;
 	
    System.out.println ("Responda as perguntas e veja o total do seu salário no mês");
 	System.out.println ("Digite o mês: ");
 	mes= ler.nextLine ();
 	System.out.println  ("Quanto você ganha por hora: ");
 	valor = ler.nextInt ();
    System.out.println  ("Quantas horas você trabalhou no mês: ");
 	horas = ler.nextInt ();
 	
 	salario = horas*valor;
 	System.out.print ("\n" +horas + " x " + valor+ " = " +salario);
 	System.out.println ("\nO sálario total referente ao mês de " +mes+ " foi de: R$" +salario);
 	
 	}
 }