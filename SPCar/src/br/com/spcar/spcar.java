package br.com.spcar;

import java.util.Scanner;

public class spcar {
	public static void main(String[] args) {
		
		/*- Preço total a pagar (calcular 20 centavos por cada km rodado)
		 * - Valor da diaria variavel 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		double valorKm = 0.20;
		
		System.out.print("Modelo do carro ->");
		String modelo = scanner.nextLine();
		
		System.out.print("Valor da diária ->");
		double diaria = scanner.nextInt();
		
		System.out.print("Quantidade de dias ->");
		int dias = scanner.nextInt();
		
		System.out.print("Km rodado -> ");
		double kmPercorrido = scanner.nextInt();
		
		double valorDiasTotal = diaria * dias;
		double acrescimoPorKm = valorKm * kmPercorrido;
		
		double total = valorDiasTotal + acrescimoPorKm;
		
		System.out.println("Modelo do carro: " + modelo + 
				"\nValor total: " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
