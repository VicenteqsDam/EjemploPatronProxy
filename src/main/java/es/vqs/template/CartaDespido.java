package es.vqs.template;

public class CartaDespido extends DocumentoPlantilla {

	@Override
	public String escribirEncabezado() {
		return "Estimado Javiolo";
	}

	@Override
	public String escribirCuerpo() {
		return "Estás despedido";
	}

}
