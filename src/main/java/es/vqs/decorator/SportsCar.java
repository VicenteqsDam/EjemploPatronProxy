package es.vqs.decorator;

public class SportsCar extends CarDecorator {
	
	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.print(" Adding features of Sports Car.");
	}
	
	public void oxidoNitroso() {
		System.out.println("Bruuuuuuuuuuuuuum");
	}
}