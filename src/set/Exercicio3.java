package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<String> num = new HashSet<String>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite uma numero: ");
			String num_rec = leia.nextLine();
			num.add(num_rec);

		}
		System.out.println("Dados: " + num);
	}
}