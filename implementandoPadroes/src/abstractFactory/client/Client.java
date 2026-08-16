package abstractFactory.client;

import abstractFactory.BrasilRulesAbstractFactory;
import abstractFactory.CountRulesAbstractFactory;
import abstractFactory.USRulesAbstractFactory;
import abstractFactory.model.factory.IphoneFactory;
import abstractFactory.model.factory.IphoneXFactory;

public class Client {

	public static void main(String[] args) {
		//CountRulesAbstractFactory rules = new BrasilRulesAbstractFactory();
		CountRulesAbstractFactory rules = new USRulesAbstractFactory();
		IphoneFactory factory = new IphoneXFactory(rules);
		factory.iPhoneOrder("standard");

	}

}
