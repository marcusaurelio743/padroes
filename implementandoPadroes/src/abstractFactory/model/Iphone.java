package abstractFactory.model;

import abstractFactory.CountRulesAbstractFactory;

public abstract class Iphone {
	public CountRulesAbstractFactory rules;

	public Iphone(CountRulesAbstractFactory rules) {
		this.rules = rules;
	}
	
	public abstract void getHardwares();
	
	public void assemble() {
		System.out.println("Assembling all the hardwares");
	}
	
	public void certificates() {
		System.out.println("test all certificates!!");
		System.out.println("certificate "+ rules.getCertificate().applyCertificate());
	}
	
	public void packing() {
		System.out.println("test All Packing!!");
		System.out.println("packing: "+rules.getPacking().applyPacking());
	}
	
	

}
