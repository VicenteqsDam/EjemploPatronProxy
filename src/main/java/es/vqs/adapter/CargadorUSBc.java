package es.vqs.adapter;

public class CargadorUSBc implements USBc {
	public void cargarMovilesUSBC() throws InterruptedException {
		System.out.println("Iniciando carga");
		System.out.println("===================");
		for (int i = 0; i < 10; i++) {
			System.out.print("#");
			Thread.sleep(1000);
		}
		System.out.println(" ¡Carga terminada!");
	}
}
