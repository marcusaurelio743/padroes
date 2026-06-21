package factory.simple.model;

public class IphoneFactory {
	public static Iphone getIphone(String model,String nivel) {
		Iphone iphone = null;
		
		if("X".equals(model)) {
			if("simples".equals(nivel)) {
				iphone = new IphoneX();
			}
		}else if("11".equals(model)) {
			if("simples".equals(nivel)) {
				iphone = new Iphone11();
			}else if("avancado".equals(nivel)) {
				iphone = new Iphone11pro();
			} 
		}
		
		iphone.enpacotar();
		iphone.teste();
		iphone.getHardware();
		
		return iphone;
	}

}
