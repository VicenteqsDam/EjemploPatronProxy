package es.vqs.adapter;

public class EjemploOrdenador {

	public static void main(String[] args) {
		SamsungSD miTarjeta = new SamsungSD();
		miTarjeta.setInformacion("Hoy que comido pescado");
		
		Ordenador o = new Ordenador();
		o.conectarSDaRanura(miTarjeta);
		o.leerDatosDeLaTarjetaSD();
		
		MicroSDSony microSD = new MicroSDSony();
		microSD.setDatos("Tengo ganas de irme a casa");
		
		AdaptadorMicroSDaSD adpt = new AdaptadorMicroSDaSD();
		adpt.setMicroSD(microSD);
		o.conectarSDaRanura(adpt);
		o.leerDatosDeLaTarjetaSD();
	}

}
