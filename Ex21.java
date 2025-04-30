/******************************************************************************
Exercicio 021
Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais (1, 2, 3, ..., 10). 
Em seguida, imprima todos os valores do vetor na tela.
*******************************************************************************/
import java.util.Scanner;
public class Ex21
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int numeros []= new int [10];
	numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
    numeros[5] = 6;
    numeros[6] = 7;
    numeros[7] = 8;
    numeros[8] = 9;
    numeros[9] = 10;
    
	for (int i = 0; i < numeros.length; i++) { 
    System.out.println(numeros[i]);
	}
	    
	}
}