package es.vqs.chain;

public class Dispensador50 implements Dispensador {

	private Dispensador siguiente;
	int billetesRestantes = 1;

	@Override
	public void siguienteEslabon(Dispensador siguienteDispensador) {
		this.siguiente = siguienteDispensador;
	}

	@Override
	public void servirBilletes(int cantidad) {
		if (cantidad >= 50) {
			do {
				cantidad = cantidad - 50;
				System.out.println("Servido un billete de 50");
				billetesRestantes--;
			} while (cantidad >= 50 && billetesRestantes >= 1);
		} 
		if (cantidad != 0) {
			this.siguiente.servirBilletes(cantidad);
		}

	}

}
