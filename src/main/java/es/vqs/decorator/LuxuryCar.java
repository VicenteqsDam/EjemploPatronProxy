package es.vqs.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void montar(){
		super.montar();
		System.out.print(" Adding features of Luxury Car.");
	}
	
	public void calentarAsientos() {
		System.out.println("A gusto....");
	}
}