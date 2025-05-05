/******************************************************************************
 24 -Crie um vetor de 8 números inteiros e conte quantas vezes um número 
 específico (que o usuário digitar) aparece no vetor..
*******************************************************************************/
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int[] vetor = new int[8];

    System.out.println("Digite os 8 números inteiros para o vetor:");
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = ler.nextInt();
        }

    System.out.print("Digite o número que deseja contar no vetor: ");
    int numeroBuscar = ler.nextInt();

    int contador = 0;
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == numeroBuscar) {
        contador++;
        }
    }
    System.out.println("O número " + numeroBuscar + " aparece " + contador + " vezes no vetor.");
    }
}