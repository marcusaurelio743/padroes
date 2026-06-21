package factory.after.model;

public abstract class Iphone {
	public abstract void getHardware();
	
	public void empacotar() {
		System.out.println("empacotando o telefone");
	}
	public void teste() {
		System.out.println("testando o telefone");
	}
	public void credencias() {
		System.out.println("carregando as credencias do telefone");
	}

}
