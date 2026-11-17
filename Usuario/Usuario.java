import java.util.Scanner;

	public class Usuario {
		public static void main(String[] args) {
		String nome;
		int idade;
		boolean ativa;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe seu nome de usuário: ");
		nome = entrada.nextLine();
		System.out.print("Informe sua idade: ");
		idade = entrada.nextInt();
		System.out.print("Informe se sua conta está ativa ou não (True ou False): ");
		ativa = entrada.nextBoolean();
		
		System.out.print("Seu nome de usuário é: " + nome);
		System.out.print("Sua idade é: " + idade);
		System.out.print("Conta ativa: " + ativa);
		} 
		
	}