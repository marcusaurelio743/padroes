package factory.before;

import java.util.Scanner;

import factory.before.model.IphineXSmark;
import factory.before.model.Iphone;
import factory.before.model.Iphone11;
import factory.before.model.Iphone11Pro;
import factory.before.model.IphoneX;

public class Client {
	
	public Iphone getIphone(String tipo, String nivel) {
		Iphone iphone = null;
		
		if(tipo.equalsIgnoreCase("x")) {
			if(nivel.equalsIgnoreCase("basico")) {
				iphone = new IphoneX();
			}else if(nivel.equalsIgnoreCase("avancado")) {
				iphone  =new IphineXSmark();
			}
		}else if(tipo.equalsIgnoreCase("comum")) {
			if(nivel.equalsIgnoreCase("basico")) {
				iphone = new Iphone11();
			}else if(nivel.equalsIgnoreCase("avancado")) {
				iphone = new Iphone11Pro();
			}
		}
		iphone.certificados();
		iphone.embalar();
		iphone.empacotar();
		iphone.getHadware();
		
		return iphone;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Client client = new Client();
		System.out.println("Informe o tipo");
		String tipo = sc.nextLine();
		System.out.println("Informe o nivel");
		String nivel  =sc.nextLine();
		client.getIphone(tipo, nivel);
		
		sc.close();

	}

}
