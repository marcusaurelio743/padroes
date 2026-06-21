package factory.after.model;

public abstract class IphoneFacotory {
	public Iphone orderIphone() {
		Iphone obj = null;
		
		obj = criarObjeto();
		obj.credencias();
		obj.empacotar();
		obj.teste();
		obj.getHardware();
		
		return obj;
	}
	
	public abstract  Iphone criarObjeto();

}
