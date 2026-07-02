package abstractFactory.model;

import abstractFactory.CountRulesAbstractFactory;

public class IphoneXSmax extends Iphone {

	public IphoneXSmax(CountRulesAbstractFactory rules) {
		super(rules);
	}

	@Override
	public void getHardwares() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");		
	}

}
