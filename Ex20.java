/******************************************************************************
Exercicio 020
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de 
números pares e a quantidade de números impares.
*******************************************************************************/
import java.util.Scanner;
public class Ex20 {
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    int numero;
    int impares=0;
    int pares=0;
    
    for (int i=1; i<11;i++) {
    System.out.println ("Digite o " +i+ " número inteiro:");
    numero= ler.nextInt ();
    
    if (numero%2==1){
    impares++;
    
    } else if (numero%2==0) {
    pares++;
    }
    }
    
    System.out.println ("Dentre os 10 números temos " + pares+ " números pares");
    System.out.println ("Dentre os 10 números temos " + impares+ " números impares");
    }
}