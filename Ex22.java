/******************************************************************************
Exercicio 022
Crie um vetor de 5 números inteiros, preencha com valores de sua escolha e calcule
a soma de todos os elementos desse vetor. Exiba o resultado.
*******************************************************************************/
import java.util.Scanner;
public class Ex22
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int numeros []= new int [5];
    int soma=0, numero;
    
	for (int i = 0; i < numeros.length; i++) { 
    System.out.println ("Digite o " +(i+1)+ "º número: ");
    numero= ler.nextInt ();
	soma = soma + numero ;
	}
	    System.out.println ("A soma de todos os números digitados é: "+ soma);
	}
}