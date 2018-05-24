package es.vqs.adapter.tarjetas;

public class Ordenador {
	private SD ranuraSD;
	
	public void conectarSDaRanura(SD tarjeta) {
		this.ranuraSD = tarjeta;
	}

	public void leerDatosDeLaTarjetaSD() {
		System.out.println(this.ranuraSD.mandarDatosPorPinesSD());
	}
}
