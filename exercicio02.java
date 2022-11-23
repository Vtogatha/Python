package secao03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		//declarar variaves
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe a quantidade minima: ");
		quantidade_minima = teclado.nextInt();
		System.out.println("Informe a quantidade maxima; ");
		quantidade_maxima = teclado.nextInt();
		
		//processamento
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
		
		//saidas
		
		System.out.println("O valor do estoque medio foi: " + estoque_medio);
		
		teclado.close();
	}

}
