package es.vqs.adapter;

public class PruebasAdapter {
	public static void main(String[] args) throws InterruptedException {
		MovilNuevo movil = new MovilNuevo();
		CargadorUSBc cargador = new CargadorUSBc();
		movil.setCargador(cargador);
		movil.cargarMovil();
	}

}
