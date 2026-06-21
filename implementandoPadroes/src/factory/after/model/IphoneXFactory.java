package factory.after.model;

public class IphoneXFactory extends IphoneFacotory {

	@Override
	public Iphone criarObjeto() {
		return new IphoneXPro();
	}

}
