package es.vqs.adapter;

public class USBCAdapter implements USBc {

	private CargadorUSB cargadorAntiguo;

	public USBCAdapter(CargadorUSB cargador) {
		this.cargadorAntiguo = cargador;
	}

	@Override
	public void cargarMovilesUSBC() throws InterruptedException {
		//hago mis movidas para transformar la carga antigua en carga USBC
		this.cargadorAntiguo.cargarAntiguo();

	}

}
