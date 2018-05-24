package es.vqs.adapter;

public class MovilNuevo {
	private USBc cargador;
	
	public void setCargador(USBc _cargador) {
		this.cargador = _cargador;
	}
	
	public void cargarMovil() throws InterruptedException {
		this.cargador.cargarMovilesUSBC();
	}
}
