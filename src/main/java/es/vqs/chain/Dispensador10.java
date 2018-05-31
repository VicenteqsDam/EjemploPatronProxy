package es.vqs.chain;

public class Dispensador10 implements Dispensador {

	private Dispensador siguiente;

	@Override
	public void siguienteEslabon(Dispensador siguienteDispensador) {
		this.siguiente = siguienteDispensador;
	}

	@Override
	public void servirBilletes(int cantidad) {
		if (cantidad >= 10) {
			do {
				cantidad = cantidad - 10;
				System.out.println("Servido un billete de 10");
			} while (cantidad >= 10);
		} 
		if (cantidad != 0) {
			this.siguiente.servirBilletes(cantidad);
		}

	}

}
