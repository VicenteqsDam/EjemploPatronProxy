package es.vqs.template;

public abstract class DocumentoPlantilla {
	
	//Es final, no se puede modificar ("overridear")
	public final void generarDocumento() {
		
	}
	
	public abstract void escribirEncabezado();
	
	public abstract void escribirCuerpo();
	
	public abstract void escribirPieDocumento();

}
