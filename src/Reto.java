import java.util.LinkedHashSet;
import java.util.Scanner;

public class Reto {

	public static void main(String[] args) {
		// Inicialización
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
		int num;

		// Proceso
		System.out.println("Introduzca los números (1-5):");
		while (conjunto.size() < 5) {
			num = sc.nextInt();
			if (num >= 1 && num <= 5)
				conjunto.add(num);
		}

		// Salida
		System.out.print("Los números introducidos son: ");
		for (Integer n : conjunto) {
			System.out.print(n + " ");
		}
	}
}
