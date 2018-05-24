package es.vqs.adapter;

public class SamsungSD implements SD {
	private String informacion;

	@Override
	public void mandarDatosPorPinesSD() {
		System.out.println("#" + this.informacion);
	}

	public void setInformacion(String inf) {
		this.informacion = inf;
	}
}
