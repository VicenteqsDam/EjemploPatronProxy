package es.vqs.template;

public abstract class DocumentoPlantilla {
	String documento;
	//Es final, no se puede modificar ("overridear")
	public final void generarDocumento() {
		System.out.println(this.escribirEncabezado());
		System.out.println(this.escribirCuerpo());
		System.out.println(this.escribirPieDocumento());
		
	}
	
	public abstract String escribirEncabezado();
	
	public abstract String escribirCuerpo();
	
	public final String escribirPieDocumento() {
		return "Un abrazo";
	}

}
