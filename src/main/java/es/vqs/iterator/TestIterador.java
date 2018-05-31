package es.vqs.iterator;

public class TestIterador {

	public static void main(String[] args) {
		PruebaImplementacionList ite = new PruebaImplementacionList();
		ite.add("Hola");
		ite.add("¡¡Qué pasa!!");
		
		for (String s: ite) {
			System.out.println(s);
		}
	}

}
