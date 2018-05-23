package es.vqs.decorator;

public abstract class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void montar() {
		this.car.montar();
	}

}

