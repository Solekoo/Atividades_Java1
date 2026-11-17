import java.util.Scanner;

public class Calculos {

		public static void main(String[] args) {
			int numeroUm;
			int numeroDois;
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe o primeiro número inteiro: ");
			numeroUm = entrada.nextInt();
			System.out.print("Informe o segundo número inteiro: ");
			numeroDois = entrada.nextInt();
			
			int soma = numeroUm + numeroDois;
			int subtracao = numeroUm - numeroDois;
			int multiplicacao = numeroUm * numeroDois; 
			double divisao = numeroUm / numeroDois;
			
			System.out.println("Soma: " + soma);
			System.out.println("Subtração: " + subtracao);
			System.out.println("Multiplicação: " + multiplicacao);
			System.out.println("Divisão: " + divisao);
		}
}