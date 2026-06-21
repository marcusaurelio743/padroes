package factory.after.model;

public class Iphone11Factory extends IphoneFacotory {

	@Override
	public Iphone criarObjeto() {
		return new Iphone11();
	}

}
