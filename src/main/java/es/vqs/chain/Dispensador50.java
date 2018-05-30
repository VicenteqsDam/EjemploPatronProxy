package es.vqs.chain;

public class Dispensador50 implements Dispensador {
	
	private Dispensador siguiente;

	@Override
	public void siguienteEslabon(Dispensador siguienteDispensador) {
		this.siguiente = siguienteDispensador;
	}

	@Override
	public void servirBilletes(int cantidad) {
		//devolver o llamar al siguiente;
		
	}

}
