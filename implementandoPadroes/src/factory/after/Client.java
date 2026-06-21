package factory.after;

import factory.after.model.Iphone;
import factory.after.model.Iphone11Factory;
import factory.after.model.IphoneFacotory;
import factory.after.model.IphoneXFactory;

public class Client {

	public static void main(String[] args) {
		IphoneFacotory iphone11Factory = new Iphone11Factory();
		IphoneFacotory iphonexFactory = new IphoneXFactory();
		System.out.println("criar IPhone 11");
		Iphone iphone11 = iphone11Factory.orderIphone();
		System.out.println(iphone11);
		
		
		System.out.println("=======================================");
		Iphone iphonex = iphonexFactory.orderIphone();
		
		System.out.println("criar IphoneX");
		System.out.println(iphonex);
		

	}

}
