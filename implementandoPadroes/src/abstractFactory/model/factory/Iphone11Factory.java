package abstractFactory.model.factory;

import abstractFactory.CountRulesAbstractFactory;
import abstractFactory.model.Iphone;
import abstractFactory.model.Iphone11;
import abstractFactory.model.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory {

	public Iphone11Factory(CountRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	protected Iphone createdIphone(String level) {
		Iphone obj = null;
		if(level.equalsIgnoreCase("standard")) {
			obj = new Iphone11(rules);
		}else if(level.equalsIgnoreCase("highEnd")) {
			obj = new Iphone11Pro(rules);
		}
		return obj;
	}

}
