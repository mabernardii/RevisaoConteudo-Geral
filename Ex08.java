/******************************************************************************
Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar 
o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento
de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 
por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) 
e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável 
multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas. 
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex08
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double pesopeixe, limite, multa;

    System.out.println ("Insira o peso do peixe: ");
    pesopeixe= ler.nextDouble ();
 	
 	limite= pesopeixe-50;
 	multa= limite*4;
 	System.out.println ("\nO peixe pesa: " +pesopeixe+ "Kg");
 	System.out.println ("A quantidade de quilos além do limite (50) foi: " +limite);
 	System.out.println ("A multa a ser paga, será de: R$: " +multa);
 	}
 }