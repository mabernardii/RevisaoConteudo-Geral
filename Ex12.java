/******************************************************************************
Exercicio 012
Faça um programa para a leitura de duas notas parciais de um aluno. O programa 
deve calcular a média alcançada por aluno e apresentar: A mensagem "Aprovado", 
se a média alcançada for maior ou igual a sete; A mensagem "Reprovado", se a 
média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for 
igual a dez.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex12
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double nota1, nota2, media;

    System.out.println ("Insira a 1º nota:");
    nota1= ler.nextDouble ();
    System.out.println ("Insira a 2º nota:");
    nota2= ler.nextDouble ();
    
    media= (nota1+nota2) / 2;
    
 	if (media>=7) {
 	    System.out.println ("Aprovado");
 	} else if (media<7) {
 	    System.out.println ("Reprovado");
 	} else if (media==10) {
 	    System.out.println ("Aprovado com Distinção");
 	} 
 	}
 }