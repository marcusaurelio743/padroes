package abstractFactory;

import abstractFactory.model.BrasilCertificate;
import abstractFactory.model.BrasilPacking;
import abstractFactory.model.Certificate;
import abstractFactory.model.Packing;

public class BrasilRulesAbstractFactory implements CountRulesAbstractFactory {

	@Override
	public Certificate getCertificate() {
		return new BrasilCertificate();
	}

	@Override
	public Packing getPacking() {
		return new BrasilPacking();
	}

}
