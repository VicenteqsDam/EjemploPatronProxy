package es.vqs.chain;

public class Cajero502010 {
	private Dispensador dispensador;

	public Cajero502010() {
		this.dispensador = new Dispensador50();
		Dispensador dispensador20 = new Dispensador20();
		Dispensador dispensador10 = new Dispensador10();
		dispensador20.siguienteEslabon(dispensador10);
		this.dispensador.siguienteEslabon(dispensador20);
	}
	
	public void sacarDinero(int cantidad) {
		this.dispensador.servirBilletes(cantidad);
	}

}
