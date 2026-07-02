package abstractFactory.model;

public class BrasilPacking implements Packing {

	@Override
	public String applyPacking() {
		
		return"\n Empacotamento Brasilieiro!!!\n";
	}

}
