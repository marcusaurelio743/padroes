package factory.before.model;

public abstract class Iphone {
	public abstract void getHadware();
	
	public void empacotar() {
		System.out.println("empacotando todos os hardwares!!");
	}
	
	public void certificados() {
		System.out.println("Verificando os certificados do dispositivo");
	}
	
	public void embalar() {
		System.out.println("embalar dispositivos");
	}

}
