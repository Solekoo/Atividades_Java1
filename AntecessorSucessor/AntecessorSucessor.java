import java.util.Scanner;

public class AntecessorSucessor {

		public static void main(String[] args) {
			int numero;
			Scanner entrada = new Scanner(System.in);
			System.out.print("Informe um número: ");
			numero = entrada.nextInt();
			
			int sucessor = numero + 1;
			int antecessor = numero - 1;
			System.out.println("Sucessor: " + sucessor);
			System.out.println("Antecessor: " + antecessor);
		}
}