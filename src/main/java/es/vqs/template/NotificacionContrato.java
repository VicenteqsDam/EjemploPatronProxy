package es.vqs.template;

public class NotificacionContrato extends DocumentoPlantilla {

	@Override
	public String escribirEncabezado() {
		return "Señor Javiolo";
	}

	@Override
	public String escribirCuerpo() {
		return "Estás contratado.";
	}

}
