import java.util.LinkedHashSet;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicializaci�n
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
		int num;

		// Proceso
		System.out.println("Introduzca los n�meros (1-5):");
		while (conjunto.size() < 5) {
			num = sc.nextInt();
			if (num >= 1 && num <= 5)
				conjunto.add(num);
		}

		// Salida
		System.out.print("Los n�meros introducidos son: ");
		for (Integer n : conjunto) {
			System.out.print(n + " ");
		}
	}
}
