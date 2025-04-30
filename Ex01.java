/******************************************************************************
Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int numero;
	
	System.out.println  ("Entre com o número desejado: ");
	numero = ler.nextInt ();
	
	System.out.println ("O número informado foi [" + numero + "]");
	
	}
}