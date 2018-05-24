package es.vqs.adapter;

public class AdaptadorMicroSDaSD implements SD {

	private MicroSDSony mSD;
	
	public void setMicroSD(MicroSDSony smsd) {
		this.mSD = smsd;
	}

	@Override
	public String mandarDatosPorPinesSD() {
		String infoMicro = new String(this.mSD.transmitirInformacion());
		return "#" + infoMicro;

	}

}
