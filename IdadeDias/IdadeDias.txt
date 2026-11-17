import java.util.Scanner;

	public class Conversao {
		public static void main(String[] args) {
		double metros;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a medida em metros: ");
		metros = entrada.nextInt();
		
		double centimetros = metros * 100;
		
		System.out.print("A medida em centímetros: " + centimetros);
		}
		
	}