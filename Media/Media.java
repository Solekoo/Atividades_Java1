import java.util.Scanner;

	public class Media {
		public static void main(String[] args) {
		int notaUm;
		int notaDois;
		int notaTres;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a primeria nota: ");
		notaUm = entrada.nextInt();
		System.out.print("Informe a segunda nota: ");
		notaDois = entrada.nextInt();
		System.out.print("Informe a terceira nota: ");
		notaTres = entrada.nextInt();
		
		double media = (notaUm + notaDois + notaTres)/3;
		
		System.out.print("Sua média é: " + media);
		}
		
	}