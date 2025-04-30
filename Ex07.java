/******************************************************************************
Exercício 007
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 
calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex07
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double altura, pesoideal;

    System.out.println ("Digite sua altura para obter seu peso ideal");
 	System.out.println ("Qual a sua altura?");
 	altura= ler.nextDouble ();
 	
 	pesoideal= (72.7*altura)-58;
 	System.out.println ("\nO peso ideal para sua altura é: " + pesoideal);
 	}
 }