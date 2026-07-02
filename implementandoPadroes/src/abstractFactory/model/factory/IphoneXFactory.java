package abstractFactory.model.factory;

import abstractFactory.CountRulesAbstractFactory;
import abstractFactory.model.Iphone;
import abstractFactory.model.IphoneX;
import abstractFactory.model.IphoneXSmax;

public class IphoneXFactory extends IphoneFactory {

	public IphoneXFactory(CountRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	protected Iphone createdIphone(String level) {
		Iphone obj = null;
		if(level.equalsIgnoreCase("standard")) {
			obj = new IphoneX(rules);
		}else if(level.equalsIgnoreCase("highEnd")) {
			obj = new IphoneXSmax(rules);
		}
		return obj;
	}

}
