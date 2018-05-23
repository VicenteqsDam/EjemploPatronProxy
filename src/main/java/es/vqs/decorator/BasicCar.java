package es.vqs.decorator;

public class BasicCar implements Car {

	@Override
	public void montar() {
		System.out.print("Basic Car.");
	}

}