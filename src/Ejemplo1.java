import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejemplo1 {
	public static void main(String[] args) {
		SortedSet<Integer> numeros = new TreeSet <>();
		numeros.add(15);
		numeros.add(18);
		numeros.add(6);
		numeros.add(21);
		numeros.add(4);
		numeros.add(10);
		numeros.add(8);
		
		System.out.println("Números ordenados: " + numeros);
		
		String listado = "Beto Luis Inés Ana";
		System.out.println("Listado de nombres: " + listado);
		Set <String> conjunto = Set.of(listado.split(" "));
		TreeSet <String> nombres = new TreeSet<>(conjunto);
		
		String primero = nombres.first();
		String ultimo = nombres.last();
		System.out.println("El primer nombre es: " + primero);
		System.out.println("El siguiente es " + nombres.higher(primero));
		System.out.println("El último nombre es: " + ultimo);
		System.out.println("El penúltimo es: " + nombres.lower(ultimo));
	
	}
}
