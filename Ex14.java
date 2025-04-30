/******************************************************************************
Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus 
colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 *******************************************************************************/
 import java.util.Scanner;
 public class Ex14
 {
 	public static void main(String[] args) {
 	Scanner ler = new Scanner (System.in);
 	double salario, aumento, salariofinal;

    System.out.println ("Insira o salário atual do colaborador:");
    salario= ler.nextDouble ();

 	if (salario<=280) {
 	    aumento= salario*20/100;
 	    salariofinal= salario+aumento;
 	    System.out.println ("O salário atual do colaborado é de: R$" +salario);
 	    System.out.println ("O porcentual de aumento aplicado seria de 20%");
 	    System.out.println ("O valor do aumento seria: R$" +aumento);
 	    System.out.println ("O salário final do colaborador ficaria em: R$" +salariofinal);
 	}  	else if (salario>=281 && salario<=700) {
 	    aumento= salario*15/100;
 	    salariofinal= salario +aumento;
 	    System.out.println ("O salário atual do colaborado é de: R$" +salario);
 	    System.out.println ("O porcentual de aumento aplicado seria de 15%");
 	    System.out.println ("O valor do aumento seria: R$" +aumento);
 	    System.out.println ("O salário final do colaborador ficaria em: R$" +salariofinal); 
 	}   else if (salario>= 701 && salario <=1500) {
 	    aumento= salario*10/100;
 	    salariofinal= salario+aumento;
 	    System.out.println ("O salário atual do colaborado é de: R$" +salario);
 	    System.out.println ("O porcentual de aumento aplicado seria de 10%");
 	    System.out.println ("O valor do aumento seria: R$" +aumento);
 	    System.out.println ("O salário final do colaborador ficaria em: R$" +salariofinal);
 	}   else if (salario>1501) {
 	    aumento= salario*5/100;
 	    salariofinal= salario+aumento;
 	    System.out.println ("O salário atual do colaborado é de: R$" +salario);
 	    System.out.println ("O porcentual de aumento aplicado seria de 5%");
 	    System.out.println ("O valor do aumento seria: R$" +aumento);
 	    System.out.println ("O salário final do colaborador ficaria em: R$" +salariofinal);
 	}
 	}
 }