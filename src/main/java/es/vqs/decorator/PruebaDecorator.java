package es.vqs.decorator;

public class PruebaDecorator {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.montar();
		((SportsCar) sportsCar).oxidoNitroso();
		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.montar();
		((SportsCar) sportsLuxuryCar).oxidoNitroso();
		((LuxuryCar) sportsLuxuryCar).calentarAsientos();

	}
}
