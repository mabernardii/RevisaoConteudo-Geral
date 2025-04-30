/******************************************************************************
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho 
em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e
que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex09
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double tamanhoarea, quantidade, precototal;

    System.out.println ("Insira o tamanho em metros quadrados da área a ser pintada: ");
    tamanhoarea= ler.nextDouble ();
 	
 	quantidade= (Math.ceil(tamanhoarea/54));
 	precototal= quantidade*80;
 	System.out.println ("\nSerá necessário " +quantidade+ " lata de tinta.");
 	System.out.println ("\nO valor a ser pago é: R$ " +precototal);
 	}
 }