package abstractFactory.model.factory;

import abstractFactory.CountRulesAbstractFactory;
import abstractFactory.model.Iphone;

public abstract class IphoneFactory {
	CountRulesAbstractFactory rules;

	public IphoneFactory(CountRulesAbstractFactory rules) {
		this.rules = rules;
	}
	public  Iphone iPhoneOrder(String level) {
		Iphone iphone = null;
		iphone = createdIphone(level);
		iphone.certificates();
		iphone.packing();
		iphone.assemble();
		iphone.getHardwares();
		
		return iphone;
		
	}
	protected abstract Iphone createdIphone(String level);
	
}
