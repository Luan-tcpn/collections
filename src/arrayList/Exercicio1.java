package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		

		for(int i = 0; i <5; i++) {
			System.out.println("Digite uma cor: ");
			String cor_recebida = leia.nextLine();
			cores.add(cor_recebida);
		}
		
		System.out.println("Lista de cores: " + cores);
		
		cores.sort(null);
		System.out.println("Cores ordenadas: " + cores);
		
		
	}

}
