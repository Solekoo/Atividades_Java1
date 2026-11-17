import java.util.Scanner;

	public class IdadeDias {
		public static void main(String[] args) {
		int anos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe sua idade em anos: ");
		anos = entrada.nextInt();
		
		int dias = anos * 365;
		
		System.out.print("Você viveu aproximadamente " + dias + " dias");
		}
		
	}