package es.vqs.template;

public class Imprenta {

	public static void main(String[] args) {
		DocumentoPlantilla doc = new CartaDespido();
		doc.generarDocumento();
		doc = new NotificacionContrato();
		doc.generarDocumento();
	}

}
