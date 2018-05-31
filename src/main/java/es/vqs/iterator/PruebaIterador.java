package es.vqs.iterator;

public class PruebaIterador {

	private String[] lista = new String[10];
	private int pos = -1;
	private int lastInsert = -1;

	public boolean hasNext() {
		if (pos < lastInsert) {
			return true;
		}
		return false;
	}

	public String next() {
		String texto = this.lista[pos];
		pos++;
		return texto;
	}

	public void volverInicio() {
		pos = 0;
	}
}
