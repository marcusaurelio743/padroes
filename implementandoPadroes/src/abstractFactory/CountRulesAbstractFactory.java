package abstractFactory;

import abstractFactory.model.Certificate;
import abstractFactory.model.Packing;

public interface CountRulesAbstractFactory {
	public Certificate getCertificate();
	
	public Packing getPacking();
	
}
