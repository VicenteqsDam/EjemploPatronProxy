package es.vqs.chain;

public interface Dispensador {

	public void siguienteEslabon(Dispensador siguienteDispensador);
	
	public void servirBilletes(int cantidad);
}
