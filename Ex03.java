/******************************************************************************
Exercicio 003
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int nota1, nota2, nota3, nota4, media;
	
	System.out.print ("Insira as 4 notas bimestrais para calcular sua média");
	System.out.println  ("\nDigite a 1º nota: ");
	nota1 = ler.nextInt ();
	System.out.println  ("\nDigite a 2º nota: ");
	nota2 = ler.nextInt ();
	System.out.println  ("\nDigite a 3º nota: ");
	nota3 = ler.nextInt ();
	System.out.println  ("\nDigite a 4º nota: ");
	nota4 = ler.nextInt ();
	
	media= nota1+nota2+nota3+nota4/4;
	System.out.print ("\n" +nota1 + "+" +nota2+ "+" +nota3+ "+" +nota4+ "/2 = " + media);
	System.out.println ("\nSua média é: " +media);
	
	}
}