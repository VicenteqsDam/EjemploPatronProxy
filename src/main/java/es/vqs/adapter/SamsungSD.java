package es.vqs.adapter;

public class SamsungSD implements SD {
	private String informacion;

	@Override
	public String mandarDatosPorPinesSD() {
		return "#" + this.informacion;
	}

	public void setInformacion(String inf) {
		this.informacion = inf;
	}
}
