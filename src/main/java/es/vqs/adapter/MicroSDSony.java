package es.vqs.adapter;

public class MicroSDSony {
	private String datos;

	public byte[] transmitirInformacion() {
		return this.datos.getBytes();
	}
	public void setDatos(String d) {
		this.datos = d;
	}
}
