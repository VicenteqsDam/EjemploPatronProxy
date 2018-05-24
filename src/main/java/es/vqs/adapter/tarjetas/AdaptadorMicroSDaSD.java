package es.vqs.adapter.tarjetas;

public class AdaptadorMicroSDaSD implements SD {

	private MicroSDSony mSD;
	
	public void setMicroSD(MicroSDSony smsd) {
		this.mSD = smsd;
	}

	@Override
	public String mandarDatosPorPinesSD() {
		byte[] bytes = this.mSD.transmitirInformacion();
		String infoMicro = new String(bytes);
		return "#" + infoMicro;

	}

}
