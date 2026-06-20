package factory.before.model;

public class Iphone11 extends Iphone {

	@Override
	public void getHadware() {
		System.out.println("Camara HD ");
		System.out.println("Tela 5.6");
		System.out.println("sensor de movimento: TRUE");
		System.out.println("RESISTENTE A AGUA");
	}

}
