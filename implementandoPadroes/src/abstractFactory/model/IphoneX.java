package abstractFactory.model;

import abstractFactory.CountRulesAbstractFactory;

public class IphoneX extends Iphone {

	public IphoneX(CountRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardwares() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");		
	}

}
