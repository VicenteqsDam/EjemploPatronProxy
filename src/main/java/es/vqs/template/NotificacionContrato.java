package es.vqs.template;

public class NotificacionContrato extends DocumentoPlantilla {

	@Override
	public String escribirEncabezado() {
		return "Se�or Javiolo";
	}

	@Override
	public String escribirCuerpo() {
		return "Est�s contratado.";
	}

}
