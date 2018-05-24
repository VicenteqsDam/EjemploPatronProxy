package es.vqs.adapter;

public class PruebasAdapter {
	public static void main(String[] args) throws InterruptedException {
		MovilNuevo movil = new MovilNuevo();
		CargadorUSBc cargador = new CargadorUSBc();
		CargadorUSB cargadorAntiguo = new CargadorUSB();
		USBCAdapter adaptador = new USBCAdapter(cargadorAntiguo);
		movil.setCargador(cargador);
		movil.cargarMovil();
		movil.setCargador(adaptador);
		movil.cargarMovil();
	}

}
