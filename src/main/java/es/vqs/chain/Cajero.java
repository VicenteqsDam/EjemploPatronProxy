package es.vqs.chain;

public class Cajero {
	private Dispensador dispensador;
	
	public Cajero() {
		this.dispensador = new Dispensador50();
		this.dispensador.siguienteEslabon(new Dispensador50());
	}

}
