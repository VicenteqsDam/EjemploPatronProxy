package es.vqs.chain;

public class Cajero102050 {
	private Dispensador dispensador;

	public Cajero102050() {
		this.dispensador = new Dispensador10();
		Dispensador dispensador20 = new Dispensador20();
		Dispensador dispensador50 = new Dispensador50();
		dispensador20.siguienteEslabon(dispensador50);
		this.dispensador.siguienteEslabon(dispensador20);
	}
	
	public void sacarDinero(int cantidad) {
		this.dispensador.servirBilletes(cantidad);
	}

}
