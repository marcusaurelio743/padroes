package factory.simple;

import factory.simple.model.Iphone;
import factory.simple.model.IphoneFactory;

public class Client {

	public static void main(String[] args) {
		System.out.println("iphone 11");
		Iphone iphone11 = IphoneFactory.getIphone("11", "simples");
		System.out.println(iphone11);
		
		System.out.println("iphone x");
		Iphone iphonex = IphoneFactory.getIphone("X", "simples");
		System.out.println(iphonex);

	}

}
