package es.vqs.adapter;

public class AdaptadorMicroSDaSD implements SD {

	private SamsungMicroSD mSD;
	
	public void setMicroSD(SamsungMicroSD smsd) {
		this.mSD = smsd;
	}

	@Override
	public void mandarDatosPorPinesSD() {
		String infoMicro = this.mSD.transmitirInformacion();
		System.out.println("#" + infoMicro);

	}

}
