/******************************************************************************
Exercicio 018
Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex18
 {
 	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int n2, n1;
    System.out.print("Digite o 1º número inteiro: ");
    n1 = ler.nextInt();

    System.out.print("Digite o 2º número inteiro: ");
    n2 = ler.nextInt();
    
    gerarIntervalo(n1, n2);
 	}
    public static void gerarIntervalo(int n1,int n2) {
    for (int i = n1; i <= n2; i++) {
    System.out.println(i);
    }
    }
}