package es.vqs.bridge.despues;

public class TestBridge {

	public static void main(String[] args) {
		Forma tri = new Triangulo();
		Forma cua = new Cuadrado();
		ColorVerde verde = new ColorVerde();
		ColorRojo rojo = new ColorRojo();
		((Cuadrado)tri).yepaCuadrado();
		tri.setColor(rojo);
		tri.getColor().imprimirValorHexadecimal();
		tri.setColor(verde);
		tri.getColor().imprimirValorHexadecimal();
		cua.setColor(rojo);
		cua.getColor().imprimirValorHexadecimal();
		cua.setColor(verde);
		cua.getColor().imprimirValorHexadecimal();
	}

}
