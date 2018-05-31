package es.vqs.chain;

public class Dispensador20 implements Dispensador {

	private Dispensador siguiente;

	@Override
	public void siguienteEslabon(Dispensador siguienteDispensador) {
		this.siguiente = siguienteDispensador;
	}

	@Override
	public void servirBilletes(int cantidad) {
		if (cantidad >= 20) {
			do {
				cantidad = cantidad - 20;
				System.out.println("Servido un billete de 20");
			} while (cantidad >= 20);
		} 
		if (cantidad != 0) {
			this.siguiente.servirBilletes(cantidad);
		}

	}

}
