package abstractFactory;

import abstractFactory.model.Certificate;
import abstractFactory.model.Packing;
import abstractFactory.model.UsCertificate;
import abstractFactory.model.UsPacking;

public class USRulesAbstractFactory implements CountRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		return new UsCertificate();
	}

	@Override
	public Packing getPacking() {
		return new UsPacking();
	}

}
