package escrita.inicial;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// aula 13 saida de dados

		double x = 10.35784;
		int y = 32;

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.println("Bom dia");
		System.out.println("Bom tarde");

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(new Locale("en", "US"));
		System.out.printf("%.2f%n", x);

		System.out.println(y);

		System.out.println("Resultado = " + x + " metros");

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
